package Java_15;

    /*
    Multi-line string literals, making it easier to write strings with newlines, HTML, JSON, SQL, etc.
    Improves readability and reduces the need for escape characters.
     */

public class TextBlocks {
    public static void main(String[] args) {

        String json = """
                    {
      "name": "Rahul",
      "age": 30,
      "city": "Mumbai"
                    }
                    """;

        System.out.println(json);

        String html = """
    <html>
        <body>
            <p>Hello, World!</p>
        </body>
    </html>
    """;

        System.out.println(html);

    }
}
