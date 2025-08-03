// Multi Level Inheritance

package basics;

class GrandParent
{
	GrandParent()
	{
		System.out.println("Grand Parent");
	}
}
class Parent extends GrandParent
{
	Parent()
	{
		System.out.println("Parent");
	}
}
public class MultiLevelInheritance extends Parent
{
	public static void main(String[] args)
	{
		new Parent();
	}
}
