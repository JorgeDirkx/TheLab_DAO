package com.jorgedirkx;

import java.io.OptionalDataException;
import java.util.List;

public interface DAO {

    public List<User> getAllUSers();

    public User getUser(int idNr);

    public void updateUser(User user);

    public void deleteUSer(User user);
}
