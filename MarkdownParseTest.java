import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    // @Test
    // public void addition() {
    // assertEquals(2, 1 + 1);
    // }
    
    // @Test
    // public void getLinks() throws IOException {
    //     Path fileName = Path.of("test-file.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(contents);
    //     assertEquals("https://something.com", links.get(0));
    //     assertEquals("some-page.html", links.get(1));
    // }
    // @Test
    // public void getLinks2() throws IOException {
    //     Path fileName = Path.of("breaking-test.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(contents);
    //     assertEquals("www.gooog()le.com", links.get(0));
    // }

    // @Test
    // public void getLinks3() throws IOException {
    //     Path fileName = Path.of("breaking-test_2.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(contents);
    //     assertEquals("www.google.com", links.get(0));
    // }

    // @Test
    // public void getLinks4() throws IOException {
    //     Path fileName = Path.of("breaking-test_3.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(contents);
    //     assertEquals(0, links.size());
    // }

    // @Test
    // public void getLinks5() throws IOException {
    //     Path fileName = Path.of("breaking-test_4.md");
	//     String contents = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(contents);
    //     assertEquals(0, links.size()); // empty file
    // }

    @Test
    public void testSnippet1() throws IOException {
        Path fileName = Path.of("snippet-1.md");
	    String contents = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("`google.com","google.com", "ucsd.edu");
        assertEquals(expected, links);
    }

    @Test
    public void testSnippet2() throws IOException {
        Path fileName = Path.of("snippet-2.md");
	    String contents = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("a.com","a.com(())", "example.com");
        assertEquals(expected, links);
    }

    @Test
    public void testSnippet3() throws IOException {
        Path fileName = Path.of("snippet-3.md");
	    String contents = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(contents);
        List<String> expected = List.of("https://ucsd-cse15l-w22.github.io/");
        assertEquals(expected, links);
    }
    
}