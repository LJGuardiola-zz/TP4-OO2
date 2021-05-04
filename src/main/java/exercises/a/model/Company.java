package exercises.a.model;

public class Company {

    private Employee director;

    public void assignDirector(Employee director) {
        this.director = director;
    }

    public double getTotalSalaryCost() {
        if (director == null)
            throw new RuntimeException("No se ha designado a un director.");
        return director.getTotalSalary();
    }

}
