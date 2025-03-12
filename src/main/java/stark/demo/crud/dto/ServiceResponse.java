package stark.demo.crud.dto;

import java.util.HashMap;

public class ServiceResponse<TData>
{
    public static final int SUCCESS_CODE = 0;
    private int code;
    private boolean success;
    private TData data;
    private String message;
    private HashMap<String, Object> other;

    public ServiceResponse()
    {
    }

    public ServiceResponse(int code, boolean success, TData data, String message, HashMap<String, Object> other)
    {
        this.code = code;
        this.success = success;
        this.data = data;
        this.message = message;
        this.other = other;
    }

    public static <TData> ServiceResponse<TData> buildSuccessResponse(TData data)
    {
        return new ServiceResponse<TData>(0, true, data, "", (HashMap) null);
    }

    public static <TData> ServiceResponse<TData> buildSuccessResponse(TData data, String message)
    {
        return new ServiceResponse<TData>(0, true, data, message, (HashMap) null);
    }

    public int getCode()
    {
        return this.code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public boolean isSuccess()
    {
        return this.success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public TData getData()
    {
        return this.data;
    }

    public void setData(TData data)
    {
        this.data = data;
    }

    public String getMessage()
    {
        return this.message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public HashMap<String, Object> getOther()
    {
        return this.other;
    }

    public void setOther(HashMap<String, Object> other)
    {
        this.other = other;
    }

    public Object getExtra(String key)
    {
        return this.other == null ? null : this.other.get(key);
    }

    public void putExtra(String key, Object value)
    {
        if (this.other == null)
        {
            this.other = new HashMap();
        }

        this.other.put(key, value);
    }
}
