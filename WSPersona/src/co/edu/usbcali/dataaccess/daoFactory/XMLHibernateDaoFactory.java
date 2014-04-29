package co.edu.usbcali.dataaccess.daoFactory;

import co.edu.usbcali.dataaccess.dao.*;


/**
 * Factory for Data Access Objects Strategy The DAO pattern can be made highly flexible
 * by adopting the Abstract Factory [GoF] and the Factory Method [GoF] patterns.
 * When the underlying storage is not subject to change from one implementation to another,
 * this strategy can be implemented using the Factory Method pattern to produce a number of DAOs needed by the application.
 * This class is a Factory Method pattern
 *
 * @author Zathura Code Generator http://code.google.com/p/zathura
 */
public class XMLHibernateDaoFactory {
    private static XMLHibernateDaoFactory instance = null;

    private XMLHibernateDaoFactory() {
    }

    /**
    *
    * @return HibernateDaoFactory
    */
    public static XMLHibernateDaoFactory getInstance() {
        if (instance == null) {
            instance = new XMLHibernateDaoFactory();
        }

        return instance;
    }

    /**
    * This method instantiates the IPersonasDAO class for HibernateCore
    * that is used in this applications deployment environment to access the data.
    * @return IPersonasDAO implementation
    */
    public IPersonasDAO getPersonasDAO() {
        return new PersonasDAO();
    }
}
