package co.edu.usbcali.modelo.control;

import co.edu.usbcali.dataaccess.daoFactory.XMLHibernateDaoFactory;
import co.edu.usbcali.dataaccess.sessionFactory.HibernateSessionFactory;
import co.edu.usbcali.exceptions.*;
import co.edu.usbcali.modelo.*;
import co.edu.usbcali.modelo.dto.PersonasDTO;
import co.edu.usbcali.utilities.Utilities;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * interface PersonasLogic
 * @author Zathura Code Generator http://code.google.com/p/zathura
 *
 */
public class PersonasLogic implements IPersonasLogic {
    public List<Personas> getPersonas() throws Exception {
        List<Personas> list = new ArrayList<Personas>();

        try {
            list = XMLHibernateDaoFactory.getInstance().getPersonasDAO()
                                         .findAll();
        } catch (Exception e) {
            throw new ZMessManager().new GettingException(ZMessManager.ALL +
                "Personas");
        } finally {
        }

        return list;
    }

    public void savePersonas(Date fechaNacimiento, String genero,
        Long idPersona, String primerApellido, String primerNombre,
        String profesion, String segundoApellido, String segundoNombre)
        throws Exception {
        Personas entity = null;

        try {
            if (fechaNacimiento == null) {
                throw new ZMessManager().new EmptyFieldException(
                    "fechaNacimiento");
            }

            if (genero == null) {
                throw new ZMessManager().new EmptyFieldException("genero");
            }

            if ((genero != null) &&
                    (Utilities.checkWordAndCheckWithlength(genero, 1) == false)) {
                throw new ZMessManager().new NotValidFormatException("genero");
            }

            if (idPersona == null) {
                throw new ZMessManager().new EmptyFieldException("idPersona");
            }

            if ((idPersona != null) &&
                    (Utilities.checkNumberAndCheckWithPrecisionAndScale("" +
                        idPersona, 15, 0) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "idPersona");
            }

            if (primerApellido == null) {
                throw new ZMessManager().new EmptyFieldException(
                    "primerApellido");
            }

            if ((primerApellido != null) &&
                    (Utilities.checkWordAndCheckWithlength(primerApellido, 15) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "primerApellido");
            }

            if (primerNombre == null) {
                throw new ZMessManager().new EmptyFieldException("primerNombre");
            }

            if ((primerNombre != null) &&
                    (Utilities.checkWordAndCheckWithlength(primerNombre, 15) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "primerNombre");
            }

            if (profesion == null) {
                throw new ZMessManager().new EmptyFieldException("profesion");
            }

            if ((profesion != null) &&
                    (Utilities.checkWordAndCheckWithlength(profesion, 30) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "profesion");
            }

            if ((segundoApellido != null) &&
                    (Utilities.checkWordAndCheckWithlength(segundoApellido, 15) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "segundoApellido");
            }

            if ((segundoNombre != null) &&
                    (Utilities.checkWordAndCheckWithlength(segundoNombre, 15) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "segundoNombre");
            }

            entity = getPersonas(idPersona);

            if (entity != null) {
                throw new ZMessManager(ZMessManager.ENTITY_WITHSAMEKEY);
            }

            entity = new Personas();
            entity.setFechaNacimiento(fechaNacimiento);
            entity.setGenero(genero);
            entity.setIdPersona(idPersona);
            entity.setPrimerApellido(primerApellido);
            entity.setPrimerNombre(primerNombre);
            entity.setProfesion(profesion);
            entity.setSegundoApellido(segundoApellido);
            entity.setSegundoNombre(segundoNombre);
            HibernateSessionFactory.beginTransaction();
            XMLHibernateDaoFactory.getInstance().getPersonasDAO().save(entity);
            HibernateSessionFactory.commit();
        } catch (Exception e) {
            HibernateSessionFactory.rollback();
            throw e;
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }

    public void deletePersonas(Long idPersona) throws Exception {
        Personas entity = null;

        if (idPersona == null) {
            throw new ZMessManager().new EmptyFieldException("idPersona");
        }

        entity = getPersonas(idPersona);

        if (entity == null) {
            throw new ZMessManager().new EmptyFieldException("Personas");
        }

        try {
            HibernateSessionFactory.beginTransaction();
            XMLHibernateDaoFactory.getInstance().getPersonasDAO().delete(entity);
            HibernateSessionFactory.commit();
        } catch (Exception e) {
            HibernateSessionFactory.rollback();
            throw e;
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }

    public void updatePersonas(Date fechaNacimiento, String genero,
        Long idPersona, String primerApellido, String primerNombre,
        String profesion, String segundoApellido, String segundoNombre)
        throws Exception {
        Personas entity = null;

        try {
            if (fechaNacimiento == null) {
                throw new ZMessManager().new EmptyFieldException(
                    "fechaNacimiento");
            }

            if (genero == null) {
                throw new ZMessManager().new EmptyFieldException("genero");
            }

            if ((genero != null) &&
                    (Utilities.checkWordAndCheckWithlength(genero, 1) == false)) {
                throw new ZMessManager().new NotValidFormatException("genero");
            }

            if (idPersona == null) {
                throw new ZMessManager().new EmptyFieldException("idPersona");
            }

            if ((idPersona != null) &&
                    (Utilities.checkNumberAndCheckWithPrecisionAndScale("" +
                        idPersona, 15, 0) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "idPersona");
            }

            if (primerApellido == null) {
                throw new ZMessManager().new EmptyFieldException(
                    "primerApellido");
            }

            if ((primerApellido != null) &&
                    (Utilities.checkWordAndCheckWithlength(primerApellido, 15) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "primerApellido");
            }

            if (primerNombre == null) {
                throw new ZMessManager().new EmptyFieldException("primerNombre");
            }

            if ((primerNombre != null) &&
                    (Utilities.checkWordAndCheckWithlength(primerNombre, 15) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "primerNombre");
            }

            if (profesion == null) {
                throw new ZMessManager().new EmptyFieldException("profesion");
            }

            if ((profesion != null) &&
                    (Utilities.checkWordAndCheckWithlength(profesion, 30) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "profesion");
            }

            if ((segundoApellido != null) &&
                    (Utilities.checkWordAndCheckWithlength(segundoApellido, 15) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "segundoApellido");
            }

            if ((segundoNombre != null) &&
                    (Utilities.checkWordAndCheckWithlength(segundoNombre, 15) == false)) {
                throw new ZMessManager().new NotValidFormatException(
                    "segundoNombre");
            }

            entity = getPersonas(idPersona);

            if (entity == null) {
                throw new ZMessManager(ZMessManager.ENTITY_NOENTITYTOUPDATE);
            }

            entity.setFechaNacimiento(fechaNacimiento);
            entity.setGenero(genero);
            entity.setIdPersona(idPersona);
            entity.setPrimerApellido(primerApellido);
            entity.setPrimerNombre(primerNombre);
            entity.setProfesion(profesion);
            entity.setSegundoApellido(segundoApellido);
            entity.setSegundoNombre(segundoNombre);
            HibernateSessionFactory.beginTransaction();
            XMLHibernateDaoFactory.getInstance().getPersonasDAO().update(entity);
            HibernateSessionFactory.commit();
        } catch (Exception e) {
            HibernateSessionFactory.rollback();
            throw e;
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }

    public Personas getPersonas(Long idPersona) throws Exception {
        Personas entity = null;

        try {
            entity = XMLHibernateDaoFactory.getInstance().getPersonasDAO()
                                           .findById(idPersona);
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Personas");
        } finally {
        }

        return entity;
    }

    public List<PersonasDTO> getDataPersonas() throws Exception {
        try {
            List<Personas> personas = XMLHibernateDaoFactory.getInstance()
                                                            .getPersonasDAO()
                                                            .findAll();

            List<PersonasDTO> personasDTO = new ArrayList<PersonasDTO>();

            for (Personas personasTmp : personas) {
                PersonasDTO personasDTO2 = new PersonasDTO();

                personasDTO2.setIdPersona(personasTmp.getIdPersona());
                personasDTO2.setFechaNacimiento(personasTmp.getFechaNacimiento());
                personasDTO2.setGenero((personasTmp.getGenero() != null)
                    ? personasTmp.getGenero() : null);
                personasDTO2.setPrimerApellido((personasTmp.getPrimerApellido() != null)
                    ? personasTmp.getPrimerApellido() : null);
                personasDTO2.setPrimerNombre((personasTmp.getPrimerNombre() != null)
                    ? personasTmp.getPrimerNombre() : null);
                personasDTO2.setProfesion((personasTmp.getProfesion() != null)
                    ? personasTmp.getProfesion() : null);
                personasDTO2.setSegundoApellido((personasTmp.getSegundoApellido() != null)
                    ? personasTmp.getSegundoApellido() : null);
                personasDTO2.setSegundoNombre((personasTmp.getSegundoNombre() != null)
                    ? personasTmp.getSegundoNombre() : null);
                personasDTO.add(personasDTO2);
            }

            return personasDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Personas> findPagePersonas(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        List<Personas> entity = null;

        try {
            entity = XMLHibernateDaoFactory.getInstance().getPersonasDAO()
                                           .findPagePersonas(sortColumnName,
                    sortAscending, startRow, maxResults);
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Personas");
        } finally {
        }

        return entity;
    }

    public Long findTotalNumberPersonas() throws Exception {
        Long entity = null;

        try {
            entity = XMLHibernateDaoFactory.getInstance().getPersonasDAO()
                                           .findTotalNumberPersonas();
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Personas Count");
        } finally {
        }

        return entity;
    }

    /**
    *
    * @param varibles
    *            este arreglo debera tener:
    *
    * [0] = String variable = (String) varibles[i]; representa como se llama la
    * variable en el pojo
    *
    * [1] = Boolean booVariable = (Boolean) varibles[i + 1]; representa si el
    * valor necesita o no ''(comillas simples)usado para campos de tipo string
    *
    * [2] = Object value = varibles[i + 2]; representa el valor que se va a
    * buscar en la BD
    *
    * [3] = String comparator = (String) varibles[i + 3]; representa que tipo
    * de busqueda voy a hacer.., ejemplo: where nombre=william o where nombre<>william,
        * en este campo iria el tipo de comparador que quiero si es = o <>
            *
            * Se itera de 4 en 4..., entonces 4 registros del arreglo representan 1
            * busqueda en un campo, si se ponen mas pues el continuara buscando en lo
            * que se le ingresen en los otros 4
            *
            *
            * @param variablesBetween
            *
            * la diferencia son estas dos posiciones
            *
            * [0] = String variable = (String) varibles[j]; la variable ne la BD que va
            * a ser buscada en un rango
            *
            * [1] = Object value = varibles[j + 1]; valor 1 para buscar en un rango
            *
            * [2] = Object value2 = varibles[j + 2]; valor 2 para buscar en un rango
            * ejempolo: a > 1 and a < 5 --> 1 seria value y 5 seria value2
                *
                * [3] = String comparator1 = (String) varibles[j + 3]; comparador 1
                * ejemplo: a comparator1 1 and a < 5
                    *
                    * [4] = String comparator2 = (String) varibles[j + 4]; comparador 2
                    * ejemplo: a comparador1>1  and a comparador2<5  (el original: a > 1 and a <
                            * 5) *
                            * @param variablesBetweenDates(en
                            *            este caso solo para mysql)
                            *  [0] = String variable = (String) varibles[k]; el nombre de la variable que hace referencia a
                            *            una fecha
                            *
                            * [1] = Object object1 = varibles[k + 2]; fecha 1 a comparar(deben ser
                            * dates)
                            *
                            * [2] = Object object2 = varibles[k + 3]; fecha 2 a comparar(deben ser
                            * dates)
                            *
                            * esto hace un between entre las dos fechas.
                            *
                            * @return lista con los objetos que se necesiten
                            * @throws Exception
                            */
    public List<Personas> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        List<Personas> list = new ArrayList<Personas>();
        String where = new String();
        String tempWhere = new String();

        if (variables != null) {
            for (int i = 0; i < variables.length; i++) {
                if ((variables[i] != null) && (variables[i + 1] != null) &&
                        (variables[i + 2] != null) &&
                        (variables[i + 3] != null)) {
                    String variable = (String) variables[i];
                    Boolean booVariable = (Boolean) variables[i + 1];
                    Object value = variables[i + 2];
                    String comparator = (String) variables[i + 3];

                    if (booVariable.booleanValue()) {
                        tempWhere = (tempWhere.length() == 0)
                            ? ("(model." + variable + " " + comparator + " \'" +
                            value + "\' )")
                            : (tempWhere + " AND (model." + variable + " " +
                            comparator + " \'" + value + "\' )");
                    } else {
                        tempWhere = (tempWhere.length() == 0)
                            ? ("(model." + variable + " " + comparator + " " +
                            value + " )")
                            : (tempWhere + " AND (model." + variable + " " +
                            comparator + " " + value + " )");
                    }
                }

                i = i + 3;
            }
        }

        if (variablesBetween != null) {
            for (int j = 0; j < variablesBetween.length; j++) {
                if ((variablesBetween[j] != null) &&
                        (variablesBetween[j + 1] != null) &&
                        (variablesBetween[j + 2] != null) &&
                        (variablesBetween[j + 3] != null) &&
                        (variablesBetween[j + 4] != null)) {
                    String variable = (String) variablesBetween[j];
                    Object value = variablesBetween[j + 1];
                    Object value2 = variablesBetween[j + 2];
                    String comparator1 = (String) variablesBetween[j + 3];
                    String comparator2 = (String) variablesBetween[j + 4];
                    tempWhere = (tempWhere.length() == 0)
                        ? ("(" + value + " " + comparator1 + " " + variable +
                        " and " + variable + " " + comparator2 + " " + value2 +
                        " )")
                        : (tempWhere + " AND (" + value + " " + comparator1 +
                        " " + variable + " and " + variable + " " +
                        comparator2 + " " + value2 + " )");
                }

                j = j + 4;
            }
        }

        if (variablesBetweenDates != null) {
            for (int k = 0; k < variablesBetweenDates.length; k++) {
                if ((variablesBetweenDates[k] != null) &&
                        (variablesBetweenDates[k + 1] != null) &&
                        (variablesBetweenDates[k + 2] != null)) {
                    String variable = (String) variablesBetweenDates[k];
                    Object object1 = variablesBetweenDates[k + 1];
                    Object object2 = variablesBetweenDates[k + 2];
                    String value = null;
                    String value2 = null;

                    try {
                        Date date1 = (Date) object1;
                        Date date2 = (Date) object2;
                        value = Utilities.formatDateWithoutTimeInAStringForBetweenWhere(date1);
                        value2 = Utilities.formatDateWithoutTimeInAStringForBetweenWhere(date2);
                    } catch (Exception e) {
                        list = null;
                        throw e;
                    }

                    tempWhere = (tempWhere.length() == 0)
                        ? ("(model." + variable + " between \'" + value +
                        "\' and \'" + value2 + "\')")
                        : (tempWhere + " AND (model." + variable +
                        " between \'" + value + "\' and \'" + value2 + "\')");
                }

                k = k + 2;
            }
        }

        if (tempWhere.length() == 0) {
            where = null;
        } else {
            where = "(" + tempWhere + ")";
        }

        try {
            list = XMLHibernateDaoFactory.getInstance().getPersonasDAO()
                                         .findByCriteria(where);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
        }

        return list;
    }
}
