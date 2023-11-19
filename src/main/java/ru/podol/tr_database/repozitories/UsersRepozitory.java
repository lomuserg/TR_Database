package ru.podol.tr_database.repozitories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podol.tr_database.models.User;
public interface UsersRepozitory extends JpaRepository<User,Long> {
}
