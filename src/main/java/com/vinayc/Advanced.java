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

public class Advanced {
    
    public static void main( String[] args ) throws Exception
    {
        // Directory
        File f=new File("./sample_index/");
        Directory memoryIndex =new SimpleFSDirectory(f.toPath());
        
        // Analyser - helps in tokenising
        StandardAnalyzer analyzer = new StandardAnalyzer();

        // uncomment and run only once - because it persists in disk, running multiple times results in multiple entries.
        {
            // index writer
            IndexWriterConfig indexWriterConfig = new IndexWriterConfig(analyzer);
            IndexWriter writer = new IndexWriter(memoryIndex, indexWriterConfig);

            // Document - record
            Document document0 = new Document();
            document0.add(new TextField("title", "The Future of Education", Field.Store.YES));
            document0.add(new TextField("content", "In this blog post, we explore the future of education and how it will change the way we learn. We discuss the potential benefits and risks of new technologies, such as AI and online learning, and how we can ensure that education is accessible to everyone.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document0);
            
            Document document1 = new Document();
            document1.add(new TextField("title", "The Importance of Early Childhood Education", Field.Store.YES));
            document1.add(new TextField("content", "Early childhood education is essential for children's development. In this blog post, we discuss the importance of early childhood education and how it can help children succeed in school and in life.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document1);
            
            Document document2 = new Document();
            document2.add(new TextField("title", "The Role of Teachers in the 21st Century", Field.Store.YES));
            document2.add(new TextField("content", "Teachers play a vital role in the education of our children. In this blog post, we discuss the role of teachers in the 21st century and how they can prepare students for success in the digital age.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document2);
            
            Document document3 = new Document();
            document3.add(new TextField("title", "The Challenges of Homeschooling", Field.Store.YES));
            document3.add(new TextField("content", "Homeschooling is a growing trend, but it can also be challenging. In this blog post, we discuss the challenges of homeschooling and how to overcome them.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document3);
            
            Document document4 = new Document();
            document4.add(new TextField("title", "The Benefits of Online Learning", Field.Store.YES));
            document4.add(new TextField("content", "Online learning is becoming increasingly popular. In this blog post, we discuss the benefits of online learning and how it can help students learn more effectively.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document4);
            
            Document document5 = new Document();
            document5.add(new TextField("title", "The Importance of Critical Thinking in Education", Field.Store.YES));
            document5.add(new TextField("content", "Critical thinking is essential for success in today's world. In this blog post, we discuss the importance of critical thinking in education and how we can teach students to think critically.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document5);
            
            Document document6 = new Document();
            document6.add(new TextField("title", "The Benefits of STEM Education", Field.Store.YES));
            document6.add(new TextField("content", "STEM education is essential for preparing students for the jobs of the future. In this blog post, we discuss the benefits of STEM education and how we can encourage more students to pursue STEM careers.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document6);
            
            Document document7 = new Document();
            document7.add(new TextField("title", "The Importance of Diversity in Education", Field.Store.YES));
            document7.add(new TextField("content", "Diversity is essential for a well-rounded education. In this blog post, we discuss the importance of diversity in education and how we can create more inclusive classrooms.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document7);
            
            Document document8 = new Document();
            document8.add(new TextField("title", "The Challenges of Teaching in a Digital Age", Field.Store.YES));
            document8.add(new TextField("content", "The digital age has presented new challenges for teachers. In this blog post, we discuss the challenges of teaching in a digital age and how teachers can adapt to the changing landscape.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document8);
            
            Document document9 = new Document();
            document9.add(new TextField("title", "The Importance of Social-Emotional Learning in Education", Field.Store.YES));
            document9.add(new TextField("content", "Social-emotional learning is essential for the well-being of our students. In this blog post, we discuss the importance of social-emotional learning in education and how we can teach students to manage their emotions effectively.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document9);
            
            Document document10 = new Document();
            document10.add(new TextField("title", "The Future of Assessment in Education", Field.Store.YES));
            document10.add(new TextField("content", "Assessment is an essential part of the educational process. In this blog post, we discuss the future of assessment in education and how we can use technology to make assessment more effective.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document10);
            
            Document document11 = new Document();
            document11.add(new TextField("title", "The Benefits of Personalized Learning in Education", Field.Store.YES));
            document11.add(new TextField("content", "Personalized learning is a promising approach to education. In this blog post, we discuss the benefits of personalized learning in education and how we can implement it in our classrooms.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document11);
            
            Document document12 = new Document();
            document12.add(new TextField("title", "The Challenges of Implementing Educational Reform", Field.Store.YES));
            document12.add(new TextField("content", "Educational reform is a complex process. In this blog post, we discuss the challenges of implementing educational reform and how we can overcome them.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document12);
            
            Document document13 = new Document();
            document13.add(new TextField("title", "The Role of Technology in Education", Field.Store.YES));
            document13.add(new TextField("content", "Technology is playing an increasingly important role in education. In this blog post, we discuss the role of technology in education and how we can use technology to improve learning outcomes.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document13);
            
            Document document14 = new Document();
            document14.add(new TextField("title", "The Future of Education in the United States", Field.Store.YES));
            document14.add(new TextField("content", "The United States is facing a number of challenges in education. In this blog post, we discuss the future of education in the United States and how we can address these challenges.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document14);
            
            Document document15 = new Document();
            document15.add(new TextField("title", "The Importance of Global Education", Field.Store.YES));
            document15.add(new TextField("content", "Global education is essential for preparing students for the world of tomorrow. In this blog post, we discuss the importance of global education", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document15);
            
            Document document16 = new Document();
            document16.add(new TextField("title", "The Future of Technology", Field.Store.YES));
            document16.add(new TextField("content", "In this blog post, we explore the future of technology and how it will change our world. We discuss the potential benefits and risks of new technologies, such as AI and robotics, and how we can ensure that technology is used for good.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document16);
            
            Document document17 = new Document();
            document17.add(new TextField("title", "The Rise of the Metaverse", Field.Store.YES));
            document17.add(new TextField("content", "The metaverse is a new virtual world that is rapidly gaining popularity. In this blog post, we explore the metaverse and discuss how it will change the way we interact with the internet.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document17);
            
            Document document18 = new Document();
            document18.add(new TextField("title", "The Future of Work", Field.Store.YES));
            document18.add(new TextField("content", "The way we work is changing rapidly. In this blog post, we explore the future of work and discuss how AI, automation, and other technologies will impact our jobs.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document18);
            
            Document document19 = new Document();
            document19.add(new TextField("title", "The Future of Learning", Field.Store.YES));
            document19.add(new TextField("content", "The way we learn is also changing rapidly. In this blog post, we explore the future of learning and discuss how AI, online courses, and other technologies will impact the way we learn.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document19);
            
            Document document20 = new Document();
            document20.add(new TextField("title", "The Future of the Planet", Field.Store.YES));
            document20.add(new TextField("content", "The future of the planet is in our hands. In this blog post, we explore the challenges facing our planet and discuss how we can work together to protect it.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document20);
            
            Document document21 = new Document();
            document21.add(new TextField("title", "The Promise of AI", Field.Store.YES));
            document21.add(new TextField("content", "Artificial intelligence (AI) is one of the most promising technologies of our time. In this blog post, we explore the promise of AI and discuss how it can be used to solve some of the world's biggest problems.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document21);
            
            Document document22 = new Document();
            document22.add(new TextField("title", "The Risks of AI", Field.Store.YES));
            document22.add(new TextField("content", "While AI has the potential to do great things, it also comes with risks. In this blog post, we explore the risks of AI and discuss how we can mitigate them.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document22);
            
            Document document23 = new Document();
            document23.add(new TextField("title", "The Future of Robotics", Field.Store.YES));
            document23.add(new TextField("content", "Robotics is another rapidly growing technology. In this blog post, we explore the future of robotics and discuss how it will impact our lives.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document23);
            
            Document document24 = new Document();
            document24.add(new TextField("title", "The Rise of the Smart Home", Field.Store.YES));
            document24.add(new TextField("content", "The smart home is becoming increasingly popular. In this blog post, we explore the rise of the smart home and discuss how it will change the way we live.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document24);
            
            Document document25 = new Document();
            document25.add(new TextField("title", "The Future of Transportation", Field.Store.YES));
            document25.add(new TextField("content", "Transportation is another area that is being disrupted by technology. In this blog post, we explore the future of transportation and discuss how it will change the way we get around.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document25);
            
            Document document26 = new Document();
            document26.add(new TextField("title", "The Future of Healthcare", Field.Store.YES));
            document26.add(new TextField("content", "Healthcare is another industry that is being transformed by technology. In this blog post, we explore the future of healthcare and discuss how it will change the way we receive care.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document26);
            
            Document document27 = new Document();
            document27.add(new TextField("title", "The Future of Finance", Field.Store.YES));
            document27.add(new TextField("content", "Finance is another industry that is being disrupted by technology. In this blog post, we explore the future of finance and discuss how it will change the way we manage our money.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document27);
            
            Document document28 = new Document();
            document28.add(new TextField("title", "The Future of Entertainment", Field.Store.YES));
            document28.add(new TextField("content", "Entertainment is another area that is being transformed by technology. In this blog post, we explore the future of entertainment and discuss how it will change the way we consume media.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document28);
            
            Document document29 = new Document();
            document29.add(new TextField("title", "The Future of Communication", Field.Store.YES));
            document29.add(new TextField("content", "Communication is another area that is being transformed by technology. In this blog post, we explore the future of communication and discuss how it will change the way we stay in touch with each other.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document29);
            
            Document document30 = new Document();
            document30.add(new TextField("title", "The Future of Security", Field.Store.YES));
            document30.add(new TextField("content", "Security is another critical area that is being impacted by technology. In this blog post, we explore the future of security and discuss how we can protect ourselves from cyber threats.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document30);
            
            Document document31 = new Document();
            document31.add(new TextField("title", "The Future of Privacy", Field.Store.YES));
            document31.add(new TextField("content", "Privacy is another important issue that is being challenged by technology. In this blog post, we explore the future of privacy and discuss how we can protect our personal data.", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document31);
            
            Document document32 = new Document();
            document32.add(new TextField("title", "The Future of Ethics", Field.Store.YES));
            document32.add(new TextField("content", "As technology continues to evolve", Field.Store.YES));
            // add the document to index using index writer
            writer.addDocument(document32);
            writer.close();
        }


        // query object - what you want to search, which field you want to search
        Query query = new QueryParser("content", analyzer).parse("Online Learning");

        // index reader
        IndexReader indexReader = DirectoryReader.open(memoryIndex);

        // index searcher
        IndexSearcher searcher = new IndexSearcher(indexReader);

        // search using searcher
        TopDocs topDocs = searcher.search(query, 10);

        int i = 1;
        for (ScoreDoc scoreDoc : topDocs.scoreDocs) {
            Document doc = searcher.doc(scoreDoc.doc); // scoreDoc.doc indicates the rank
            System.out.println("--------------------------------------------------------");
            System.out.println("Rank: " + i++);
            System.out.println(doc.get("title") + " : " + doc.get("content"));
            System.out.println("--------------------------------------------------------");
        }
        indexReader.close();
    }
}
