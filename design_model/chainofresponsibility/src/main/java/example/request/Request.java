package example.request;

import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 15:54
 */
@Data
public class Request {

    private String requestType;

    private String requestContent;

    private int number;
}
