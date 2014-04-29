package co.edu.usbcali.dataaccess.dao;

import co.edu.usbcali.dataaccess.sessionFactory.HibernateSessionFactory;
import co.edu.usbcali.modelo.Personas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.criterion.Example;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * A data access object (DAO) providing persistence and search support for
 * Personas entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 *
 * @author Zathura Code Generator http://code.google.com/p/zathura
 *
 */
public class PersonasDAO implements IPersonasDAO {
    private static final Log log = LogFactory.getLog(PersonasDAO.class);

    // property constants
    //public static final Date  FECHANACIMIENTO = "fechaNacimiento";
    public static final String FECHANACIMIENTO = "fechaNacimiento";

    //public static final String  GENERO = "genero";
    public static final String GENERO = "genero";

    //public static final Long  IDPERSONA = "idPersona";
    public static final String IDPERSONA = "idPersona";

    //public static final String  PRIMERAPELLIDO = "primerApellido";
    public static final String PRIMERAPELLIDO = "primerApellido";

    //public static final String  PRIMERNOMBRE = "primerNombre";
    public static final String PRIMERNOMBRE = "primerNombre";

    //public static final String  PROFESION = "profesion";
    public static final String PROFESION = "profesion";

    //public static final String  SEGUNDOAPELLIDO = "segundoApellido";
    public static final String SEGUNDOAPELLIDO = "segundoApellido";

    //public static final String  SEGUNDONOMBRE = "segundoNombre";
    public static final String SEGUNDONOMBRE = "segundoNombre";

    private Session getSession() {
        return HibernateSessionFactory.getSession();
    }

    /**
    *
    * @param Instance
    *            Personas Instance to persist
    * @throws RuntimeException
    *             when the operation fails
    */
    public void save(Personas instance) {
        log.debug("saving Personas instance");

        try {
            getSession().save(instance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }

    /**
    * @param Instance
    *            Personas Instance to delete
    * @throws RuntimeException
    *             when the operation fails
    */
    public void delete(Personas instance) {
        log.debug("deleting Personas instance");

        try {
            getSession().delete(instance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }

    /**
    *
    * @param Instance
    *            Personas Instance to update
    * @throws RuntimeException
    *             when the operation fails
    */
    public void update(Personas instance) {
        log.debug("updating Personas instance");

        try {
            getSession().update(instance);
            log.debug("update successful");
        } catch (RuntimeException re) {
            log.error("update failed", re);
            throw re;
        }
    }

    public Personas findById(Long id) {
        log.debug("finding Personas instance with id: " + id);

        try {
            Personas instance = (Personas) getSession().get(Personas.class, id);

            return instance;
        } catch (RuntimeException re) {
            log.error("finding Personas failed", re);
            throw re;
        }
    }

    public List<Personas> findByExample(Personas instance) {
        log.debug("finding Personas instance by example");

        try {
            List results = getSession().createCriteria("Personas")
                               .add(Example.create(instance)).list();
            log.debug("find by example successful, result size: " +
                results.size());

            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }

    /**
    * Find all  Personas entities with a specific property value.
    *
    * @param value
    *            the property value to match
    * @param propertyName
    *            the property to search in the instance
    * @return List< Personas> found by query
        */
    public List<Personas> findByProperty(String propertyName, Object value) {
        log.debug("finding Personas instance with property: " + propertyName +
            ", value: " + value);

        try {
            String queryString = "from Personas as model where model." +
                propertyName + "= ?";
            Query queryObject = getSession().createQuery(queryString);
            queryObject.setParameter(0, value);

            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by property name failed", re);
            throw re;
        }
    }

    public List<Personas> findByFechaNacimiento(Object fechaNacimiento) {
        return findByProperty(FECHANACIMIENTO, fechaNacimiento);
    }

    public List<Personas> findByGenero(Object genero) {
        return findByProperty(GENERO, genero);
    }

    public List<Personas> findByIdPersona(Object idPersona) {
        return findByProperty(IDPERSONA, idPersona);
    }

    public List<Personas> findByPrimerApellido(Object primerApellido) {
        return findByProperty(PRIMERAPELLIDO, primerApellido);
    }

    public List<Personas> findByPrimerNombre(Object primerNombre) {
        return findByProperty(PRIMERNOMBRE, primerNombre);
    }

    public List<Personas> findByProfesion(Object profesion) {
        return findByProperty(PROFESION, profesion);
    }

    public List<Personas> findBySegundoApellido(Object segundoApellido) {
        return findByProperty(SEGUNDOAPELLIDO, segundoApellido);
    }

    public List<Personas> findBySegundoNombre(Object segundoNombre) {
        return findByProperty(SEGUNDONOMBRE, segundoNombre);
    }

    /**
    * Find all Personas entities.
    *
    * @return List<Personas> all Personas instances
    */
    public List<Personas> findAll() {
        log.debug("finding all Personas instances");

        try {
            String queryString = "from Personas";
            Query queryObject = getSession().createQuery(queryString);

            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find all failed", re);
            throw re;
        }
    }

    public List<Personas> findByCriteria(String whereCondition) {
        log.debug("finding Personas " + whereCondition);

        try {
            String where = ((whereCondition == null) ||
                (whereCondition.length() == 0)) ? "" : ("where " +
                whereCondition);
            final String queryString = "select model from Personas model " +
                where;
            Query query = getSession().createQuery(queryString);
            List<Personas> entitiesList = query.list();

            return entitiesList;
        } catch (RuntimeException re) {
            log.error("find By Criteria in Personas failed", re);
            throw re;
        }
    }

    public List<Personas> findPagePersonas(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults) {
        log.debug("finding Personas findPagePersonas");

        if ((sortColumnName != null) && (sortColumnName.length() > 0)) {
            try {
                String queryString = "select model from Personas model order by model." +
                    sortColumnName + " " + (sortAscending ? "asc" : "desc");

                return getSession().createQuery(queryString)
                           .setFirstResult(startRow).setMaxResults(maxResults)
                           .list();
            } catch (RuntimeException re) {
                throw re;
            }
        } else {
            try {
                String queryString = "select model from Personas model";

                return getSession().createQuery(queryString)
                           .setFirstResult(startRow).setMaxResults(maxResults)
                           .list();
            } catch (RuntimeException re) {
                throw re;
            }
        }
    }

    public Long findTotalNumberPersonas() {
        log.debug("finding Personas count");

        try {
            String queryString = "select count(*) from Personas model";
            Query queryObject = getSession().createQuery(queryString);

            return (Long) queryObject.list().get(0);
        } catch (RuntimeException re) {
            throw re;
        }
    }
}
