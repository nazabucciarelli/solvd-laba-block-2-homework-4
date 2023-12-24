package com.solvd.animals_mvc;

import com.solvd.animals_mvc.dao.ConnectionPool;
import com.solvd.animals_mvc.dao.IAnimalRoomDAO;
import com.solvd.animals_mvc.dao.IDepartmentDAO;
import com.solvd.animals_mvc.dao.IZooDAO;
import com.solvd.animals_mvc.model.AnimalRoom;
import com.solvd.animals_mvc.model.Department;
import com.solvd.animals_mvc.model.Zoo;
import com.solvd.animals_mvc.service.AnimalRoomService;
import com.solvd.animals_mvc.service.DepartmentService;
import com.solvd.animals_mvc.service.ZooService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        ZooService zooService = new ZooService();
        DepartmentService departmentService = new DepartmentService();
        AnimalRoomService animalRoomService = new AnimalRoomService();

        Long zooId = zooService.create(new Zoo("California Zoo", 450), "Logic " +
                "Department", "Aquatic", 200);
        animalRoomService.create(new AnimalRoom("Birds",50,zooId));
        animalRoomService.create(new AnimalRoom("Felines",10,zooId));
        Long hrDepId = departmentService.create(new Department("HR Department",
                zooId));
        departmentService.getAnimalRoomsInSameZoo(hrDepId);
        animalRoomService.getAnimalRoomsCapacityOver100();
        zooService.logDepartmentsAndAnimalRooms(zooId);
        zooService.updateById(new Zoo("Texas Zoo",2000),zooId);
        zooService.delete(zooId); // Keep in mind that this line deletes everything done above
    }
}
