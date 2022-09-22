public class WebsiteTester
{
    public static void main(String[] args)
    {
        Website codehs = new Website('codehs', 'com', 1000);
        Website yandex = new Website('yandex', 'org', 1000000000);
        Website stackoverflow = new Website('stackoverflow', 'com', 0394850934850384050340);
        
        System.out.println(String.format('%s\n%s\n%s\n', codehs, yandex, stackoverflow));
    }
}