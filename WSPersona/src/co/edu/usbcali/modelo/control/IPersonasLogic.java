package co.edu.usbcali.modelo.control;

import co.edu.usbcali.modelo.Personas;
import co.edu.usbcali.modelo.dto.PersonasDTO;

import java.math.BigDecimal;

import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * interface PersonasLogic
 * @author Zathura Code Generator http://code.google.com/p/zathura
 *
 */
public interface IPersonasLogic {
    public List<Personas> getPersonas() throws Exception;

    public void savePersonas(Date fechaNacimiento, String genero,
        Long idPersona, String primerApellido, String primerNombre,
        String profesion, String segundoApellido, String segundoNombre)
        throws Exception;

    public void deletePersonas(Long idPersona) throws Exception;

    public void updatePersonas(Date fechaNacimiento, String genero,
        Long idPersona, String primerApellido, String primerNombre,
        String profesion, String segundoApellido, String segundoNombre)
        throws Exception;

    public Personas getPersonas(Long idPersona) throws Exception;

    public List<Personas> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Personas> findPagePersonas(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberPersonas() throws Exception;

    public List<PersonasDTO> getDataPersonas() throws Exception;
}
