import java.util.*;
import java.awt.*;
 @SuppressWarnings("unchecked")
public class StudentTester extends junit.framework.TestCase
{
//isProperSubsetOf
    public void testIsProperSubsetOf01()
    {
       String problemMessage = "isProperSubsetOf test 3";
       AllenWittrySet <String> first = new AllenWittrySet <String>("tree");
       AllenWittrySet  <String>second = new AllenWittrySet <String>("tree");
       first.add("werwqr");

       assertEquals (false, first.isProperSubsetOf(second));
       assertEquals (true, second.isProperSubsetOf(first));
    }

//isSubsetOf
    public void testIsSubsetOf01()
    {
       String problemMessage = "isSubsetOf test 3";
       AllenWittrySet  <String>first = new AllenWittrySet  <String>("tree");
       AllenWittrySet <String> second = new AllenWittrySet <String>("tree");
       first.add("werwqr");

       assertEquals (false, first.isSubsetOf(second));
       assertEquals (true, second.isSubsetOf(first));
    }

// test equals
    public void testEquals01()
    {
       String problemMessage = "equals test 3";
       AllenWittrySet <String> first = new AllenWittrySet <String> ("tree");
       AllenWittrySet <String> second = new AllenWittrySet <String> ("tree");

       assertEquals(0, first.size());
       assertEquals (true, first.equals(second));
       assertEquals (true, second.equals(first));
    }

// test remove
    public void testRemove01()
    {
       String problemMessage = "remove test 1";
       AllenWittrySet <String> first = new AllenWittrySet <String> ("tree");
       first.add("1");
       first.add("2");
       first.add("3");
       first.add("4");
       first.add("5");
       first.add("6");

       first.remove("3");
       first.remove("4");
       first.remove("5");

       assertEquals(3, first.size());
       assertEquals(true, first.contains("1"));
       assertEquals(true, first.contains("2"));
       assertEquals(true, first.contains("6"));

       assertEquals(false, first.contains("3"));
       assertEquals(false, first.contains("4"));
       assertEquals(false, first.contains("5"));
    }

//public Object[] toArray()
    public void testToArray01()
    {
       String problemMessage = "testToArray test 1";
       AllenWittrySet <String> first = new AllenWittrySet <String> ("tree");

       Object[] myArray = first.toArray();
       assertEquals(0, myArray.length);
    }


//setDifference
    public void testSetDifference01()
    {
       String problemMessage = "testSetDifference test 1";
       AllenWittrySet <String> first = new AllenWittrySet <String> ("tree");
       AllenWittrySet <String> second = new AllenWittrySet <String> ("tree");       

       AllenWittrySet difference = first.setDifference(second);
       assertEquals(0, difference.size());
       assertEquals(true, difference.isEmpty());
    }

//setIntersection
    public void testIntersection01()
    {
       String problemMessage = "Intersection test 1";
       AllenWittrySet <String> first = new AllenWittrySet <String> ("tree");
       AllenWittrySet <String> second = new AllenWittrySet <String> ("tree"); 
       first.add("1");
       first.add("2");
       first.add("3");

       AllenWittrySet <String> intersection = first.setIntersection(second);
       assertEquals(0, intersection.size());
       assertEquals(true, intersection.isEmpty());

       second.add("a");
       second.add("b");
       second.add("c");

       intersection = first.setIntersection(second);
       assertEquals(0, intersection.size());
       assertEquals(true, intersection.isEmpty());
    }

// test add
    public void testAdd01()
    {
       String problemMessage = "Add test 1";
       AllenWittrySet <String> first = new AllenWittrySet <String> ("tree");
       Set second = new TreeSet();
       first.add("1");
       first.add("2");
       first.add("3");
       first.add("4");
       first.add("5");
       first.add("6");

       second.add("1");
       second.add("2");
       second.add("3");
       second.add("4");
       second.add("5");
       second.add("6");

       assertEquals(6, first.size());
       Iterator iter = first.iterator();
       while (iter.hasNext())
       {
          assertEquals(true, second.contains(iter.next()));
       }
    }

// test size
    public void testSize01()
    {
       String problemMessage = "Size test 1";
       AllenWittrySet <Integer> first = new AllenWittrySet <Integer> ("tree");
       int someValue = 0;
       for (int i = 0; i < someValue; i++)
       {
           first.add(new Integer(i));
       }
       assertEquals(someValue, first.size());
    }

    public void testUnion01()
    {
       String problemMessage = "Union test 1";
       AllenWittrySet <String> first = new AllenWittrySet <String> ("tree");
       AllenWittrySet <String> second = new AllenWittrySet <String> ("tree");
       first.add("1");
       first.add("2");
       first.add("3");

       second.add("a");
       second.add("b");
       second.add("c");

       AllenWittrySet <String> union = first.setUnion(second);
       assertEquals(true, union.contains("3"));
       assertEquals(true, union.contains("1"));
       assertEquals(true, union.contains("2"));
       assertEquals(true, union.contains("a"));
       assertEquals(true, union.contains("b"));
       assertEquals(true, union.contains("c"));
       assertEquals(6, union.size());
    }

//isEmpty
    public void testIsEmpty01()
    {
       String problemMessage = "isEmpty test 1";
       AllenWittrySet <Integer>  first = new AllenWittrySet <Integer> ("tree");
       int someValue = 0;
       for (int i = 0; i < someValue; i++)
       {
           first.add(new Integer(i));
       }
       assertEquals(true, first.isEmpty());
    }

//toString
    public void testToString01()
    {
       String problemMessage = "toString test 1";
       AllenWittrySet <Integer>  first = new AllenWittrySet <Integer> ("tree");
       int someValue = 0;
       for (int i = 0; i < someValue; i++)
       {
           first.add(new Integer(i));
       }
       assertEquals("[]", first.toString());
    }
}