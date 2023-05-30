package navigation;

import java.util.ArrayList;

public class NavigationMenu extends NavigationComponent
{
    private String name;
    private ArrayList<NavigationComponent> navigationComponents = new ArrayList<>();

    public NavigationMenu(String name)
    {
        this.name = name;
    }

    @Override
    public void addChild(NavigationComponent navigationComponent) {
        navigationComponents.add(navigationComponent);
    }

    @Override
    public ArrayList<NavigationComponent> getChildren() {
        return navigationComponents;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
        for (NavigationComponent nc : navigationComponents) {
            System.out.print("\t");
            nc.print();
        }
    }
}
