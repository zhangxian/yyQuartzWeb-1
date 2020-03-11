package com.yycoin.vo;

public class TCenterTcpExpense {
    private String id;

    private String name;

    private String flowkey;

    private String stafferid;

    private String borrowstafferid;

    private String departmentid;

    private Integer type;

    private Integer ticikcount;

    private Integer paytype;

    private Integer status;

    private String refid;

    private String logtime;

    private String srccity;

    private String destcity;

    private Long airplanecharges;

    private Long traincharges;

    private Long buscharges;

    private Long hotelcharges;

    private Long entertaincharges;

    private Long allowancecharges;

    private Long other1charges;

    private Long other2charges;

    private String begindate;

    private String enddate;

    private String description;

    private Long total;

    private Long borrowtotal;

    private Long lastmoney;

    private Long refmoney;

    private String unitname;

    private String address;

    private String customernames;

    private String aroundnames;

    private String companystaffernames;

    private Integer stype;

    private Integer specialtype;

    private String dutyid;

    private String compliance;

    private Integer marketingflag;

    private String processtime;

    private String bankprovince;

    private String bankcity;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFlowkey() {
        return flowkey;
    }

    public void setFlowkey(String flowkey) {
        this.flowkey = flowkey == null ? null : flowkey.trim();
    }

    public String getStafferid() {
        return stafferid;
    }

    public void setStafferid(String stafferid) {
        this.stafferid = stafferid == null ? null : stafferid.trim();
    }

    public String getBorrowstafferid() {
        return borrowstafferid;
    }

    public void setBorrowstafferid(String borrowstafferid) {
        this.borrowstafferid = borrowstafferid == null ? null : borrowstafferid.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTicikcount() {
        return ticikcount;
    }

    public void setTicikcount(Integer ticikcount) {
        this.ticikcount = ticikcount;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid == null ? null : refid.trim();
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime == null ? null : logtime.trim();
    }

    public String getSrccity() {
        return srccity;
    }

    public void setSrccity(String srccity) {
        this.srccity = srccity == null ? null : srccity.trim();
    }

    public String getDestcity() {
        return destcity;
    }

    public void setDestcity(String destcity) {
        this.destcity = destcity == null ? null : destcity.trim();
    }

    public Long getAirplanecharges() {
        return airplanecharges;
    }

    public void setAirplanecharges(Long airplanecharges) {
        this.airplanecharges = airplanecharges;
    }

    public Long getTraincharges() {
        return traincharges;
    }

    public void setTraincharges(Long traincharges) {
        this.traincharges = traincharges;
    }

    public Long getBuscharges() {
        return buscharges;
    }

    public void setBuscharges(Long buscharges) {
        this.buscharges = buscharges;
    }

    public Long getHotelcharges() {
        return hotelcharges;
    }

    public void setHotelcharges(Long hotelcharges) {
        this.hotelcharges = hotelcharges;
    }

    public Long getEntertaincharges() {
        return entertaincharges;
    }

    public void setEntertaincharges(Long entertaincharges) {
        this.entertaincharges = entertaincharges;
    }

    public Long getAllowancecharges() {
        return allowancecharges;
    }

    public void setAllowancecharges(Long allowancecharges) {
        this.allowancecharges = allowancecharges;
    }

    public Long getOther1charges() {
        return other1charges;
    }

    public void setOther1charges(Long other1charges) {
        this.other1charges = other1charges;
    }

    public Long getOther2charges() {
        return other2charges;
    }

    public void setOther2charges(Long other2charges) {
        this.other2charges = other2charges;
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getBorrowtotal() {
        return borrowtotal;
    }

    public void setBorrowtotal(Long borrowtotal) {
        this.borrowtotal = borrowtotal;
    }

    public Long getLastmoney() {
        return lastmoney;
    }

    public void setLastmoney(Long lastmoney) {
        this.lastmoney = lastmoney;
    }

    public Long getRefmoney() {
        return refmoney;
    }

    public void setRefmoney(Long refmoney) {
        this.refmoney = refmoney;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCustomernames() {
        return customernames;
    }

    public void setCustomernames(String customernames) {
        this.customernames = customernames == null ? null : customernames.trim();
    }

    public String getAroundnames() {
        return aroundnames;
    }

    public void setAroundnames(String aroundnames) {
        this.aroundnames = aroundnames == null ? null : aroundnames.trim();
    }

    public String getCompanystaffernames() {
        return companystaffernames;
    }

    public void setCompanystaffernames(String companystaffernames) {
        this.companystaffernames = companystaffernames == null ? null : companystaffernames.trim();
    }

    public Integer getStype() {
        return stype;
    }

    public void setStype(Integer stype) {
        this.stype = stype;
    }

    public Integer getSpecialtype() {
        return specialtype;
    }

    public void setSpecialtype(Integer specialtype) {
        this.specialtype = specialtype;
    }

    public String getDutyid() {
        return dutyid;
    }

    public void setDutyid(String dutyid) {
        this.dutyid = dutyid == null ? null : dutyid.trim();
    }

    public String getCompliance() {
        return compliance;
    }

    public void setCompliance(String compliance) {
        this.compliance = compliance == null ? null : compliance.trim();
    }

    public Integer getMarketingflag() {
        return marketingflag;
    }

    public void setMarketingflag(Integer marketingflag) {
        this.marketingflag = marketingflag;
    }

    public String getProcesstime() {
        return processtime;
    }

    public void setProcesstime(String processtime) {
        this.processtime = processtime == null ? null : processtime.trim();
    }

    public String getBankprovince() {
        return bankprovince;
    }

    public void setBankprovince(String bankprovince) {
        this.bankprovince = bankprovince == null ? null : bankprovince.trim();
    }

    public String getBankcity() {
        return bankcity;
    }

    public void setBankcity(String bankcity) {
        this.bankcity = bankcity == null ? null : bankcity.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}