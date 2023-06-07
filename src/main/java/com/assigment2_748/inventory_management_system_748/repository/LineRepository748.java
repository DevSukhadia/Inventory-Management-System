package com.assigment2_748.inventory_management_system_748.repository;

import com.assigment2_748.inventory_management_system_748.model.CompositeIds.LineId748;
import com.assigment2_748.inventory_management_system_748.model.Line748;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LineRepository748 extends JpaRepository<Line748, LineId748> {
    @Query("SELECT l FROM Line748 l JOIN l.lineId748.purchaseOrder748 po WHERE po.po_no_748 = :po_no_748")
    List<Line748> findByLineId748_PurchaseOrder748_Po_no_748(@Param("po_no_748") int po_no_748);
}
