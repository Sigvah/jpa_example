package no.hvl.dat250.jpa.basicexample;



import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class DaoTodo {

    private final EntityManager entityManager;

    public DaoTodo(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Todo getTodo(Long id) {
        return entityManager.find(Todo.class, id);
    }
    public List<Todo> getAll() {
        Query q = entityManager.createQuery("SELECT todos FROM Todo todos");
        return q.getResultList();
    }

    public Todo updateTodo(Todo t) {
        if(entityManager.contains(t)) {
            entityManager.getTransaction().begin();
            Todo newtodo = entityManager.find(Todo.class, t.getId());
            newtodo.setDescription(t.getDescription());
            newtodo.setSummary(t.getDescription());
            entityManager.getTransaction().commit();
            return newtodo;
        }
        return null;
    }

    public Todo deleteTodo(Todo t) {
        if(entityManager.contains(t)) {
            entityManager.getTransaction().begin();
            entityManager.remove(t);
            entityManager.getTransaction().commit();
        } else {
            System.out.println("Tried to delete" + t.toString());
        }
        return t;
    }
    public void addTodo(Todo t) {
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();
        System.out.println("Added " + t.toString());
    }
}