package com.assigment2_748.inventory_management_system_748.service;

import com.assigment2_748.inventory_management_system_748.model.CompositeIds.LineId748;
import com.assigment2_748.inventory_management_system_748.model.Line748;
import com.assigment2_748.inventory_management_system_748.model.Part748;
import com.assigment2_748.inventory_management_system_748.model.PurchaseOrder748;
import com.assigment2_748.inventory_management_system_748.repository.LineRepository748;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LineService748 {
    private final LineRepository748 lineRepository748;

    @Autowired
    public LineService748(LineRepository748 lineRepository748) {
        this.lineRepository748 = lineRepository748;
    }

    public List<Line748> getAllLinesByPoId(int po_no_748) {
        return lineRepository748.findByLineId748_PurchaseOrder748_Po_no_748(po_no_748);
    }

    public List<Line748> insertLines(List<Part748> parts748, List<Integer> partQuantities,
                                     PurchaseOrder748 purchaseOrder748) {
        if (parts748.size() != partQuantities.size()) {
            return null;
        }

        List<Line748> insertedLines = new ArrayList<>();
        for (int i = 0; i < parts748.size(); i++) {
            Part748 part748 = parts748.get(i);
            Integer partQuantity = partQuantities.get(i);
            LineId748 lineId748 = new LineId748(part748, purchaseOrder748);

            Line748 line748 = new Line748(lineId748, part748.getCurrent_price_748().intValue(), partQuantity);

            insertedLines.add(lineRepository748.save(line748));
        }

        return insertedLines;
    }
}
