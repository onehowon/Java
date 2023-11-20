package ip;

import java.net.URL;

public class url_1 {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.codechobo.com:80/sample/" + "hello.html?referer=codechobo#index1");

        System.out.println("url.getAuthority"+url.getAuthority());
        System.out.println("url.getAuthority"+url.getContent());
        System.out.println("url.getAuthority"+url.getDefaultPort());
        System.out.println("url.getAuthority"+url.getPort());
        System.out.println("url.getAuthority"+url.getFile());
        System.out.println("url.getAuthority"+url.getHost());
        System.out.println("url.getAuthority"+url.getPath());
        System.out.println("url.getAuthority"+url.getProtocol());
        System.out.println("url.getAuthority"+url.getQuery());
        System.out.println("url.getAuthority"+url.getRef());

    }
}
