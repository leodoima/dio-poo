package dio.me;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Developer {

    private String name;

    private Set<ContentCourse> disciplinesSubscribed = new LinkedHashSet<>();

    private Set<ContentCourse> disciplinesConcluded = new LinkedHashSet<>();

    public Developer(String name) {
        this.name = name;
    }

    public void enrollBootcamp(Bootcamp bootcamp) {
        disciplinesSubscribed.addAll(bootcamp.getDisciplinesIncluded());
    }

    public void completeDiscipline() throws Exception {
        Optional<ContentCourse> nextDiscipline = this.disciplinesSubscribed.stream().findFirst();

        if (nextDiscipline.isEmpty()) {
            throw new Exception("Disciplines subscribed is not found");
        }

        validateCompleteDiscipline(nextDiscipline.get());

        disciplinesConcluded.add(nextDiscipline.get());
    }

    private void validateCompleteDiscipline(ContentCourse contentCourse) throws Exception {
        boolean removeDiscipline = disciplinesSubscribed.remove(contentCourse);
        if (!removeDiscipline) {
            throw new Exception("Is not possible concluded the discipline in this moment");
        }
    }

    public double calculateXp() {
        return this.disciplinesConcluded.stream().mapToDouble(ContentCourse::calculateXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ContentCourse> getDisciplinesSubscribed() {
        return disciplinesSubscribed;
    }

    public void setDisciplinesSubscribed(Set<ContentCourse> disciplinesSubscribed) {
        this.disciplinesSubscribed = disciplinesSubscribed;
    }

    public Set<ContentCourse> getDisciplinesConcluded() {
        return disciplinesConcluded;
    }

    public void setDisciplinesConcluded(Set<ContentCourse> disciplinesConcluded) {
        this.disciplinesConcluded = disciplinesConcluded;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + this.name + '\'' +
                ", disciplinesSubscribed=" + this.disciplinesSubscribed +
                ", disciplinesConcluded=" + this.disciplinesConcluded +
                ", XP=" + this.calculateXp() +
                '}';
    }
}
