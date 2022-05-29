package item11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeTest {

    public static void main(String[] args) {
        Map<HashCodeTestClass, String> testMap = new HashMap();
        testMap.put(new HashCodeTestClass("10"), "!");
        testMap.put(new HashCodeTestClass("100"), "!!");
        testMap.put(new HashCodeTestClass("1000"), "!!!");

        String s = testMap.get(new HashCodeTestClass("10"));
        System.out.println("s = " + s);

    }

    private static class HashCodeTestClass {

        private final String id;

        public HashCodeTestClass(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == this) {
                return true;
            }

            if(obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            return ((HashCodeTestClass) obj).getId().equals(this.getId());
        }
    }
}
