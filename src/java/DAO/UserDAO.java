/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.util.List;

//Isi sama JavaBeans kalian di package Model
import model.UserBean;
import model.AllUserBean;
import model.LoginBean;

/**
 *
 * @author pc asus
 */
public interface UserDAO {
    // Actions ------------------------------------------------------------------------------------

    /**
     * Returns the user from the database matching the given ID, otherwise null.
     * @param id The ID of the user to be returned.
     * @return The user from the database matching the given ID, otherwise null.
     * @throws DAOException If something fails at database level.
     */
    public UserBean find(Long id) throws DAOException;

    /**
     * Returns the user from the database matching the given email and password, otherwise null.
     * @param email The email of the user to be returned.
     * @param password The password of the user to be returned.
     * @return The user from the database matching the given email and password, otherwise null.
     * @throws DAOException If something fails at database level.
     */
    public UserBean find(String email, String password) throws DAOException;

    /**
     * Returns a list of all users from the database ordered by user ID. The list is never null and
     * is empty when the database does not contain any user.
     * @return A list of all users from the database ordered by user ID.
     * @throws DAOException If something fails at database level.
     */
    public List<UserBean> list() throws DAOException;

    /**
     * Create the given user in the database. The user ID must be null, otherwise it will throw
     * IllegalArgumentException. After creating, the DAO will set the obtained ID in the given user.
     * @param user The user to be created in the database.
     * @throws IllegalArgumentException If the user ID is not null.
     * @throws DAOException If something fails at database level.
     */
    public void create(UserBean user) throws IllegalArgumentException, DAOException;

    /**
     * Update the given user in the database. The user ID must not be null, otherwise it will throw
     * IllegalArgumentException. Note: the password will NOT be updated. Use changePassword() instead.
     * @param user The user to be updated in the database.
     * @throws IllegalArgumentException If the user ID is null.
     * @throws DAOException If something fails at database level.
     */
    public void update(UserBean user) throws IllegalArgumentException, DAOException;

    /**
     * Delete the given user from the database. After deleting, the DAO will set the ID of the given
     * user to null.
     * @param user The user to be deleted from the database.
     * @throws DAOException If something fails at database level.
     */
    public void delete(UserBean user) throws DAOException;

    /**
     * Returns true if the given email address exist in the database.
     * @param email The email address which is to be checked in the database.
     * @return True if the given email address exist in the database.
     * @throws DAOException If something fails at database level.
     */
    public boolean existEmail(String email) throws DAOException;

    /**
     * Change the password of the given user. The user ID must not be null, otherwise it will throw
     * IllegalArgumentException.
     * @param user The user to change the password for.
     * @throws IllegalArgumentException If the user ID is null.
     * @throws DAOException If something fails at database level.
     */
    public void changePassword(UserBean user) throws DAOException;

}