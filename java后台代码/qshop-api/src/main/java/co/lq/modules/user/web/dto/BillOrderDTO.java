package co.lq.modules.user.web.dto;

import java.util.List;

import lombok.Data;

/**
 * @ClassName BillDTO
 * @Author billy
 * @Date 2019/11/12
 **/
@Data
public class BillOrderDTO {
    private String                   time;
    private Integer                  count;
    private List<BillOrderRecordDTO> child;
}
