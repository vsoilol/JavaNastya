import java.util.HashSet;
import java.util.Set;

public interface Operations {
    HashSet<String> difference(Set<String> firstSet, Set<String> secondSet);

    HashSet<String> intersection(Set<String> firstSet, Set<String> secondSet);

    HashSet<String> minus(Set<String> firstSet, Set<String> secondSet);

    HashSet<String> union(Set<String> firstSet, Set<String> secondSet);
}
