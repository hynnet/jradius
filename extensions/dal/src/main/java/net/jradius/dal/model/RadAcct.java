package net.jradius.dal.model;

import com.coova.dal.Record;
import java.util.Date;

public class RadAcct extends Record {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.id
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private Long id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctsessionid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String acctsessionid = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctuniqueid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String acctuniqueid = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.username
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String username = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.groupname
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String groupname = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.realm
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String realm = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.nasipaddress
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String nasipaddress = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.nasportid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String nasportid;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.nasporttype
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String nasporttype;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctstarttime
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private Date acctstarttime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctstoptime
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private Date acctstoptime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctsessiontime
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private Integer acctsessiontime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctauthentic
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String acctauthentic;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.connectinfo_start
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String connectinfoStart;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.connectinfo_stop
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String connectinfoStop;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctinputoctets
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private Long acctinputoctets;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctoutputoctets
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private Long acctoutputoctets;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.calledstationid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String calledstationid = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.callingstationid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String callingstationid = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctterminatecause
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String acctterminatecause = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.servicetype
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String servicetype;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.framedprotocol
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String framedprotocol;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.framedipaddress
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String framedipaddress = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctstartdelay
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private Integer acctstartdelay;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.acctstopdelay
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private Integer acctstopdelay;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radacct.xascendsessionsvrkey
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String xascendsessionsvrkey;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.id
     *
     * @return the value of radacct.id
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.id
     *
     * @param id the value for radacct.id
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctsessionid
     *
     * @return the value of radacct.acctsessionid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getAcctsessionid() {
        return acctsessionid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctsessionid
     *
     * @param acctsessionid the value for radacct.acctsessionid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctsessionid(String acctsessionid) {
        this.acctsessionid = acctsessionid == null ? null : acctsessionid.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctuniqueid
     *
     * @return the value of radacct.acctuniqueid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getAcctuniqueid() {
        return acctuniqueid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctuniqueid
     *
     * @param acctuniqueid the value for radacct.acctuniqueid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctuniqueid(String acctuniqueid) {
        this.acctuniqueid = acctuniqueid == null ? null : acctuniqueid.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.username
     *
     * @return the value of radacct.username
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.username
     *
     * @param username the value for radacct.username
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.groupname
     *
     * @return the value of radacct.groupname
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.groupname
     *
     * @param groupname the value for radacct.groupname
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.realm
     *
     * @return the value of radacct.realm
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getRealm() {
        return realm;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.realm
     *
     * @param realm the value for radacct.realm
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setRealm(String realm) {
        this.realm = realm == null ? null : realm.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.nasipaddress
     *
     * @return the value of radacct.nasipaddress
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getNasipaddress() {
        return nasipaddress;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.nasipaddress
     *
     * @param nasipaddress the value for radacct.nasipaddress
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setNasipaddress(String nasipaddress) {
        this.nasipaddress = nasipaddress == null ? null : nasipaddress.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.nasportid
     *
     * @return the value of radacct.nasportid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getNasportid() {
        return nasportid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.nasportid
     *
     * @param nasportid the value for radacct.nasportid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setNasportid(String nasportid) {
        this.nasportid = nasportid == null ? null : nasportid.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.nasporttype
     *
     * @return the value of radacct.nasporttype
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getNasporttype() {
        return nasporttype;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.nasporttype
     *
     * @param nasporttype the value for radacct.nasporttype
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setNasporttype(String nasporttype) {
        this.nasporttype = nasporttype == null ? null : nasporttype.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctstarttime
     *
     * @return the value of radacct.acctstarttime
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Date getAcctstarttime() {
        return acctstarttime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctstarttime
     *
     * @param acctstarttime the value for radacct.acctstarttime
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctstarttime(Date acctstarttime) {
        this.acctstarttime = acctstarttime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctstoptime
     *
     * @return the value of radacct.acctstoptime
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Date getAcctstoptime() {
        return acctstoptime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctstoptime
     *
     * @param acctstoptime the value for radacct.acctstoptime
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctstoptime(Date acctstoptime) {
        this.acctstoptime = acctstoptime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctsessiontime
     *
     * @return the value of radacct.acctsessiontime
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Integer getAcctsessiontime() {
        return acctsessiontime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctsessiontime
     *
     * @param acctsessiontime the value for radacct.acctsessiontime
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctsessiontime(Integer acctsessiontime) {
        this.acctsessiontime = acctsessiontime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctauthentic
     *
     * @return the value of radacct.acctauthentic
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getAcctauthentic() {
        return acctauthentic;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctauthentic
     *
     * @param acctauthentic the value for radacct.acctauthentic
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctauthentic(String acctauthentic) {
        this.acctauthentic = acctauthentic == null ? null : acctauthentic.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.connectinfo_start
     *
     * @return the value of radacct.connectinfo_start
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getConnectinfoStart() {
        return connectinfoStart;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.connectinfo_start
     *
     * @param connectinfoStart the value for radacct.connectinfo_start
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setConnectinfoStart(String connectinfoStart) {
        this.connectinfoStart = connectinfoStart == null ? null : connectinfoStart.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.connectinfo_stop
     *
     * @return the value of radacct.connectinfo_stop
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getConnectinfoStop() {
        return connectinfoStop;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.connectinfo_stop
     *
     * @param connectinfoStop the value for radacct.connectinfo_stop
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setConnectinfoStop(String connectinfoStop) {
        this.connectinfoStop = connectinfoStop == null ? null : connectinfoStop.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctinputoctets
     *
     * @return the value of radacct.acctinputoctets
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Long getAcctinputoctets() {
        return acctinputoctets;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctinputoctets
     *
     * @param acctinputoctets the value for radacct.acctinputoctets
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctinputoctets(Long acctinputoctets) {
        this.acctinputoctets = acctinputoctets;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctoutputoctets
     *
     * @return the value of radacct.acctoutputoctets
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Long getAcctoutputoctets() {
        return acctoutputoctets;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctoutputoctets
     *
     * @param acctoutputoctets the value for radacct.acctoutputoctets
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctoutputoctets(Long acctoutputoctets) {
        this.acctoutputoctets = acctoutputoctets;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.calledstationid
     *
     * @return the value of radacct.calledstationid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getCalledstationid() {
        return calledstationid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.calledstationid
     *
     * @param calledstationid the value for radacct.calledstationid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setCalledstationid(String calledstationid) {
        this.calledstationid = calledstationid == null ? null : calledstationid.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.callingstationid
     *
     * @return the value of radacct.callingstationid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getCallingstationid() {
        return callingstationid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.callingstationid
     *
     * @param callingstationid the value for radacct.callingstationid
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setCallingstationid(String callingstationid) {
        this.callingstationid = callingstationid == null ? null : callingstationid.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctterminatecause
     *
     * @return the value of radacct.acctterminatecause
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getAcctterminatecause() {
        return acctterminatecause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctterminatecause
     *
     * @param acctterminatecause the value for radacct.acctterminatecause
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctterminatecause(String acctterminatecause) {
        this.acctterminatecause = acctterminatecause == null ? null : acctterminatecause.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.servicetype
     *
     * @return the value of radacct.servicetype
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getServicetype() {
        return servicetype;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.servicetype
     *
     * @param servicetype the value for radacct.servicetype
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setServicetype(String servicetype) {
        this.servicetype = servicetype == null ? null : servicetype.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.framedprotocol
     *
     * @return the value of radacct.framedprotocol
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getFramedprotocol() {
        return framedprotocol;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.framedprotocol
     *
     * @param framedprotocol the value for radacct.framedprotocol
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setFramedprotocol(String framedprotocol) {
        this.framedprotocol = framedprotocol == null ? null : framedprotocol.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.framedipaddress
     *
     * @return the value of radacct.framedipaddress
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getFramedipaddress() {
        return framedipaddress;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.framedipaddress
     *
     * @param framedipaddress the value for radacct.framedipaddress
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setFramedipaddress(String framedipaddress) {
        this.framedipaddress = framedipaddress == null ? null : framedipaddress.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctstartdelay
     *
     * @return the value of radacct.acctstartdelay
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Integer getAcctstartdelay() {
        return acctstartdelay;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctstartdelay
     *
     * @param acctstartdelay the value for radacct.acctstartdelay
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctstartdelay(Integer acctstartdelay) {
        this.acctstartdelay = acctstartdelay;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.acctstopdelay
     *
     * @return the value of radacct.acctstopdelay
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Integer getAcctstopdelay() {
        return acctstopdelay;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.acctstopdelay
     *
     * @param acctstopdelay the value for radacct.acctstopdelay
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAcctstopdelay(Integer acctstopdelay) {
        this.acctstopdelay = acctstopdelay;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radacct.xascendsessionsvrkey
     *
     * @return the value of radacct.xascendsessionsvrkey
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getXascendsessionsvrkey() {
        return xascendsessionsvrkey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radacct.xascendsessionsvrkey
     *
     * @param xascendsessionsvrkey the value for radacct.xascendsessionsvrkey
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setXascendsessionsvrkey(String xascendsessionsvrkey) {
        this.xascendsessionsvrkey = xascendsessionsvrkey == null ? null : xascendsessionsvrkey.trim();
    }

    public Record synchronizedRecord() {
        return new SynchronizedRadAcct(this);
    }
}