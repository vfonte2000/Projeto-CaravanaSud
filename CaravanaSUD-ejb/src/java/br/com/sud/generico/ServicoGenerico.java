package br.com.sud.generico;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Valcelio
 * @param <T>
 */
public class ServicoGenerico<T> {

    @PersistenceContext
    private EntityManager entityManager;

    public final Class<T> entity;

    public ServicoGenerico(Class<T> entity) {
        this.entity = entity;
    }

    public void save(T entity) {
        entityManager.persist(entity);
    }

    public void update(T entity) {
        entityManager.merge(entity);
        entityManager.flush();
    }

    public void delete(T entity) {
        entityManager.remove(entity);
    }

    public T find(Long entityID) {
        return entityManager.find(this.entity, entityID);
    }

    public List<T> findAll() {
        return entityManager.createQuery("select e from " + this.entity.getSimpleName() + " e ").getResultList();
    }
}
