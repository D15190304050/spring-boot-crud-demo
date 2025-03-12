package stark.demo.crud.dto;

import lombok.Data;

@Data
public class PaginationRequest
{
    private long pageIndex;
    private long pageSize;
}
