package MandelBrot.model;

public class RequestData
{
    private Double RealFrom;
    private Double RealTo;
    private Double ImaginaryFrom;
    private Double ImaginaryTo;
    private Double Interval;
    private Integer MaxIteration;

    public void setRealFrom(Double realFrom)
    {
        RealFrom = realFrom;
    }

    public Double getRealFrom()
    {
        return RealFrom;
    }

    public void setRealTo(Double realTo)
    {
        RealTo = realTo;
    }

    public Double getRealTo()
    {
        return RealTo;
    }

    public void setImaginaryFrom(Double imaginaryFrom)
    {
        ImaginaryFrom = imaginaryFrom;
    }

    public Double getImaginaryFrom()
    {
        return ImaginaryFrom;
    }

    public void setImaginaryTo(Double imaginaryTo)
    {
        ImaginaryTo = imaginaryTo;
    }

    public Double getImaginaryTo()
    {
        return ImaginaryTo;
    }

    public void setInterval(Double interval)
    {
        Interval = interval;
    }

    public Double getInterval()
    {
        return Interval;
    }

    public void setMaxIteration(Integer maxIteration)
    {
        MaxIteration = maxIteration;
    }

    public Integer getMaxIteration()
    {
        return MaxIteration;
    }
}