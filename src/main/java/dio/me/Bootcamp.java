package dio.me;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = LocalDate.now().plusDays(45);

    private Set<Developer> developersSubscribed = new HashSet<>();

    private Set<ContentCourse> disciplinesIncluded = new LinkedHashSet<>();

    public Bootcamp(String name, Set<ContentCourse> disciplinesIncluded) {
        this.name = name;
        this.disciplinesIncluded = disciplinesIncluded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Developer> getDevelopersSubscribed() {
        return developersSubscribed;
    }

    public void setDevelopersSubscribed(Set<Developer> developersSubscribed) {
        this.developersSubscribed = developersSubscribed;
    }

    public Set<ContentCourse> getDisciplinesIncluded() {
        return disciplinesIncluded;
    }

    public void setDisciplinesIncluded(Set<ContentCourse> disciplinesIncluded) {
        this.disciplinesIncluded = disciplinesIncluded;
    }
}
