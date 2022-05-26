import java.util.HashSet;
import java.util.Set;

public class SetOperations implements Operations {
    @Override
    public HashSet<String> difference(Set<String> firstSet, Set<String> secondSet) {
        HashSet<String> newSet = new HashSet<>();
        for (String item : firstSet) {
            if (!secondSet.contains(item)) {
                newSet.add(item);
            }

        }
        for (String item : secondSet) {
            if (!firstSet.contains(item)) {
                newSet.add(item);
            }
        }
        return newSet;
    }

    @Override
    public HashSet<String> intersection(Set<String> firstSet, Set<String> secondSet) {
        HashSet<String> newSet = new HashSet<>();
        for (String item : firstSet) {
            if (secondSet.contains(item)) {
                newSet.add(item);
            }
        }
        for (String item : secondSet) {
            if (firstSet.contains(item)) {
                newSet.add(item);
            }
        }
        return newSet;
    }

    @Override
    public HashSet<String> minus(Set<String> firstSet, Set<String> secondSet) {
        HashSet<String> newSet = new HashSet<>();
        for (String item : firstSet) {
            if (secondSet.contains(item)) {
                continue;
            }
            newSet.add(item);
        }
        return newSet;
    }

    @Override
    public HashSet<String> union(Set<String> firstSet, Set<String> secondSet) {
        HashSet<String> newSet = new HashSet<>(firstSet);
        newSet.addAll(secondSet);
        return newSet;
    }
}
