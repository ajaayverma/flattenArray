/**
 * Created by Ajay on 5/20/2018.
 */
import com.upday.FlattenArray;
import org.junit.Assert;
import org.junit.Test;

public class IntegerArrayFlattenerTest {

    Integer[] expectedArray = new Integer[]{1,11,21,31,41,51,61};

    @Test
    public void testNullReturnsNull() throws IllegalArgumentException {
        Assert.assertNull(
                "Test for null argument",
                FlattenArray.flatten(null)
        );
    }

    @Test
    public void testEmptyArray() throws IllegalArgumentException {
        Assert.assertArrayEquals(
                "Test for an empty array",
                new Integer[]{},
                FlattenArray.flatten(new Object[]{})
        );
    }

    @Test
    public void testFlatArray() throws IllegalArgumentException {
        Assert.assertArrayEquals(
                "Test for a flat array",
                expectedArray,
                FlattenArray.flatten(new Object[]{1,11,21,31,41,51,61})
        );
    }

    @Test
    public void testNestedArray() throws IllegalArgumentException {
        Assert.assertArrayEquals(
                "Test for nested array",
                expectedArray,
                FlattenArray.flatten(new Object[]{1, 11, 21, 31, new Object[]{41, 51},61})
        );
    }

    @Test
    public void testMultipleNestedArrays() throws IllegalArgumentException {
        Assert.assertArrayEquals(
                "Test for a multiple nested arrays",
                expectedArray,
                FlattenArray.flatten(new Object[]{1, 11, new Object[]{21, 31, new Object[]{41}, 51},61})
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionForObjectInArray() throws IllegalArgumentException {
        FlattenArray.flatten(
                new Object[]{new Object()}
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionForObjectInNestedArray() throws IllegalArgumentException {
        FlattenArray.flatten(
                new Object[]{1, 11, new Object[]{21, new Object()}}
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionForNullInArray() throws IllegalArgumentException {
        FlattenArray.flatten(
                new Object[]{null}
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionForNullInNestedArray() throws IllegalArgumentException {
        FlattenArray.flatten(
                new Object[]{1, 11, new Object[]{21, null}}
        );
    }

}
