package navigation;

public class NavigationItem extends NavigationComponent
{
    private String name;
    private String link;


    public NavigationItem(String name, String link)
    {
        this.name = name;
        this.link = link;
    }

    public void print() {
        System.out.println("\t" + name + ", " + link);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLink() {
        return link;
    }
}
