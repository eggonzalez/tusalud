package co.edu.usbcali.dataaccess.dao;

import co.edu.usbcali.modelo.Personas;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * Interface for PersonasDAO.
 * @author Zathura Code Generator http://code.google.com/p/zathura
 *
 */
public interface IPersonasDAO {
    public void save(Personas instance);

    public void delete(Personas instance);

    public void update(Personas instance);

    public Personas findById(Long id);

    public List<Personas> findByExample(Personas instance);

    public List<Personas> findByProperty(String propertyName, Object value);

    public List<Personas> findAll();

    public List<Personas> findByCriteria(String whereCondition);

    public List<Personas> findPagePersonas(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults);

    public Long findTotalNumberPersonas();

    public List<Personas> findByFechaNacimiento(Object fechaNacimiento);

    public List<Personas> findByGenero(Object genero);

    public List<Personas> findByIdPersona(Object idPersona);

    public List<Personas> findByPrimerApellido(Object primerApellido);

    public List<Personas> findByPrimerNombre(Object primerNombre);

    public List<Personas> findByProfesion(Object profesion);

    public List<Personas> findBySegundoApellido(Object segundoApellido);

    public List<Personas> findBySegundoNombre(Object segundoNombre);
}
