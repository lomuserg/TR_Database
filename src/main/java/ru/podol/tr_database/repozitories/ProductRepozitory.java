package ru.podol.tr_database.repozitories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podol.tr_database.models.Product;

public interface ProductRepozitory extends JpaRepository<Product,Long> {
}
