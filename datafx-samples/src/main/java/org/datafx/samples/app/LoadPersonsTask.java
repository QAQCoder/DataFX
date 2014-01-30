package org.datafx.samples.app;

import javax.inject.Inject;
import org.datafx.provider.ListDataProvider;
import org.datafx.provider.ListDataProviderBuilder;
import org.datafx.reader.ArrayDataReader;
import org.datafx.reader.DataReader;

public class LoadPersonsTask implements Runnable {

    Person[] persons = {
        new Person("Johan Vos", "Johan is CTO at LodgON, a Java Champion, a member of the BeJUG steering group, the Devoxx steering group and he is a JCP member."),
        new Person("Jonathan Giles", "Jonathan Giles is the JavaFX UI controls technical lead at Oracle, where he has been involved with JavaFX since 2009."),
        new Person("Hendrik Ebbers", "Hendrik Ebbers is Senior Java Architect at Materna GmbH in Dortmund, Germany.")};

    @Inject
    private DataModel model;

    @Override
    public void run() {
        model.getPersons().clear();
        ListDataProvider<Person> ldp = ListDataProviderBuilder.<Person>create()
                .dataReader(new ArrayDataReader(persons))
                .resultList(model.getPersons())
                .build();
        ldp.retrieve();
    }
}