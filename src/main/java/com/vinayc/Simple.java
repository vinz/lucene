package com.vinayc;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.SimpleFSDirectory;
import java.io.File;

/**
 * Lucene Example
 *
 */
public class Simple 
{
    public static void main( String[] args ) throws Exception
    {
        // Directory
        File f=new File("./sample_index/");
        Directory memoryIndex =new SimpleFSDirectory(f.toPath());
        
        // Analyser - helps in tokenising
        StandardAnalyzer analyzer = new StandardAnalyzer();

        // index writer
        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(analyzer);
        IndexWriter writter = new IndexWriter(memoryIndex, indexWriterConfig);

        // Document - record
        Document document = new Document();
        document.add(new TextField("name", "Robert", Field.Store.YES));
        document.add(new TextField("job", "Software Engineer", Field.Store.YES));
        // add the document to index using index writer
        writter.addDocument(document);

        Document document2 = new Document();
        document2.add(new TextField("name", "John", Field.Store.YES));
        document2.add(new TextField("job", "Software Manager", Field.Store.YES));
        // add the document to index using index writer
        writter.addDocument(document2);

        writter.close();

        // query object - what you want to search, which field you want to search
        Query query = new QueryParser("job", analyzer).parse("Manager");

        // index reader
        IndexReader indexReader = DirectoryReader.open(memoryIndex);

        // index searcher
        IndexSearcher searcher = new IndexSearcher(indexReader);

        // search using searcher
        TopDocs topDocs = searcher.search(query, 10);

        
        for (ScoreDoc scoreDoc : topDocs.scoreDocs) {
            Document doc = searcher.doc(scoreDoc.doc); // scoreDoc.doc indicates the rank
            System.out.println(doc.get("name") + " : " + doc.get("job"));
        }
        indexReader.close();
    }
}