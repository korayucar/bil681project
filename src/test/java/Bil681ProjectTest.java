import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.process.DocumentPreprocessor;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Created by koray2 on 4/8/16.
 */
public class Bil681ProjectTest  {

    @Test
    public void testParseDirectory() throws Exception {
        Bil681Project project = new Bil681Project();
        List<Document> documents = project.memoizeDocumentsUnderPath(Paths.get("test-data"));
        for(Document d : documents){
            assertNotNull(d);
        }
        List<Bil681Project.RecipeData> recipeDatas = project.parseDocuments(documents);
        assertEquals(documents.size() ,1 );
        for(Bil681Project.RecipeData data  : recipeDatas)
        {
            DocumentPreprocessor dp = new DocumentPreprocessor(data.toPlainString());
            for (List<HasWord> sentence : dp) {
                System.out.println(sentence);
            }
        }
    }
}