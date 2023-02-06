import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    class Page{
    String url;
    Integer viewCount;
    public Page(String url, Integer viewCount){
        this.url = url;
        this.viewCount = viewCount;
    }
}

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push(new Page("link1", 9));
        stack.push(new Page("link2", 4));
        stack.push(new Page("link3", 2));
        stack.push(new Page("link4", 11));


    }
}