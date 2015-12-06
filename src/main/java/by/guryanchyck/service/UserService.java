package by.guryanchyck.service;

import by.guryanchyck.dao.UserDAO;
import by.guryanchyck.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Alexei Guryanchyck
 */
public interface UserService {

    void addUser(User user);

    void addUser(String[] dataArray);

    List<User> values(int offset, int noOfRecords, String compareMethod);

    void addAllUsers(List<User> users);

    long getNoOfRecords();

    void setUserDAO(UserDAO userDAO);

    int getRecordsPerPage();

    void setRecordsPerPage(int recordsPerPage);

    String getSortedMethod();

    void setSortedMethod(String sortedMethod);
}
