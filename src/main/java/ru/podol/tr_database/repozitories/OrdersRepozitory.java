package ru.podol.tr_database.repozitories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podol.tr_database.models.Order;

public interface OrdersRepozitory extends JpaRepository<Order,Long> {
}
