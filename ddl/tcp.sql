CREATE TABLE t_center_maycur_consumedetail_root (
report_id varchar(64) NOT NULL DEFAULT '',
report_type varchar(64) DEFAULT NULL,
NAME varchar(64) DEFAULT NULL,
formSubType varchar(64) DEFAULT NULL,
DATE varchar(64) DEFAULT NULL,
amount varchar(64) DEFAULT NULL,
approvedAmount varchar(64) DEFAULT NULL,
outstandingAmount varchar(64) DEFAULT NULL,
repaymentTime varchar(64) DEFAULT NULL,
collectionCurrency varchar(64) DEFAULT NULL,
cost_center varchar(64) DEFAULT NULL,
departmentBusinessCode varchar(64) DEFAULT NULL,
departmentName varchar(64) DEFAULT NULL,
departmentFullName varchar(64) DEFAULT NULL,
reim_user_code varchar(64) DEFAULT NULL,
reimUserName varchar(64) DEFAULT NULL,
cover_user_code varchar(64) DEFAULT NULL,
coverUserName varchar(64) DEFAULT NULL,
status varchar(64) DEFAULT NULL,
pay_amount varchar(64) DEFAULT NULL,
pay_method varchar(64) DEFAULT NULL,
subsidiary_name varchar(64) DEFAULT NULL,
subsidiary_code varchar(64) DEFAULT NULL,
createdAt varchar(64) DEFAULT NULL,
submittedAt varchar(64) DEFAULT NULL,
approvedAt varchar(64) DEFAULT NULL,
settledAt varchar(64) DEFAULT NULL,
modifiedAt varchar(64) DEFAULT NULL,
exportStatus varchar(64) DEFAULT NULL,
voucherNum varchar(64) DEFAULT NULL,
exportComments varchar(64) DEFAULT NULL,
attendeesPosition int(11) DEFAULT NULL,
accompaniedEmployeeNos longtext,
payment longtext,
costTrackings longtext,
expenses longtext,
expense longtext,
approval_process longtext,
finance_codes varchar(64) DEFAULT NULL,
repayments longtext,
loan longtext,
travelRecords longtext,
operationLogs longtext,
baseCurrency varchar(64) DEFAULT NULL,
collectionToBaseExchangeRate varchar(64) DEFAULT NULL,
baseAmount varchar(64) DEFAULT NULL,
attachments longtext,
savetime varchar(32) DEFAULT NULL,
PRIMARY KEY (report_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE t_center_maycur_consumesubmit (
report_id varchar(64) NOT NULL DEFAULT '',
report_type varchar(64) DEFAULT NULL,
formSubType varchar(64) DEFAULT NULL,
NAME varchar(64) DEFAULT NULL,
DATE varchar(64) DEFAULT NULL,
amount varchar(64) DEFAULT NULL,
approvedAmount varchar(64) DEFAULT NULL,
cost_center varchar(64) DEFAULT NULL,
departmentBusinessCode varchar(64) DEFAULT NULL,
departmentName varchar(64) DEFAULT NULL,
departmentFullName varchar(128) DEFAULT NULL,
reim_user_code varchar(64) DEFAULT NULL,
reimUserName varchar(64) DEFAULT NULL,
cover_user_code varchar(64) DEFAULT NULL,
coverUserName varchar(64) DEFAULT NULL,
STATUS varchar(64) DEFAULT NULL,
pay_amount varchar(64) DEFAULT NULL,
pay_method varchar(64) DEFAULT NULL,
subsidiary_name varchar(64) DEFAULT NULL,
subsidiary_code varchar(64) DEFAULT NULL,
createdAt varchar(64) DEFAULT NULL,
submittedAt varchar(64) DEFAULT NULL,
approvedAt varchar(64) DEFAULT NULL,
settledAt varchar(64) DEFAULT NULL,
modifiedAt varchar(64) DEFAULT NULL,
deleteFlag varchar(64) DEFAULT NULL,
exportflag int(11) DEFAULT '0',
exporttime varchar(32) DEFAULT NULL,
savetime varchar(32) DEFAULT NULL,
createflag int(11) DEFAULT '0' COMMENT '是否已创建oa单据:0-未创建;1-已创建',
createtime varchar(32) DEFAULT NULL COMMENT '创建OA单据时间',
paymentstatus int(11) DEFAULT '0' COMMENT '是否已通知每刻:0-未通知;1-已通知',
paymenttime varchar(32) DEFAULT NULL COMMENT '通知每刻时间',
oaorderid varchar(64) DEFAULT NULL COMMENT 'oa单据id',
PRIMARY KEY (report_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE t_center_maycur_expensedetail_root (
report_id varchar(64) NOT NULL DEFAULT '',
report_type varchar(64) DEFAULT NULL,
NAME varchar(64) DEFAULT NULL,
formSubType varchar(64) DEFAULT NULL,
DATE varchar(64) DEFAULT NULL,
amount varchar(64) DEFAULT NULL,
approvedAmount varchar(64) DEFAULT NULL,
collectionCurrency varchar(64) DEFAULT NULL,
cost_center varchar(64) DEFAULT NULL,
departmentBusinessCode varchar(64) DEFAULT NULL,
departmentName varchar(64) DEFAULT NULL,
departmentFullName varchar(64) DEFAULT NULL,
reim_user_code varchar(64) DEFAULT NULL,
reimUserName varchar(64) DEFAULT NULL,
cover_user_code varchar(64) DEFAULT NULL,
coverUserName varchar(64) DEFAULT NULL,
status varchar(64) DEFAULT NULL,
pay_amount varchar(64) DEFAULT NULL,
pay_method varchar(64) DEFAULT NULL,
subsidiary_name varchar(64) DEFAULT NULL,
subsidiary_code varchar(64) DEFAULT NULL,
createdAt varchar(64) DEFAULT NULL,
submittedAt varchar(64) DEFAULT NULL,
approvedAt varchar(64) DEFAULT NULL,
settledAt varchar(64) DEFAULT NULL,
modifiedAt varchar(64) DEFAULT NULL,
exportStatus varchar(64) DEFAULT NULL,
voucherNum varchar(64) DEFAULT NULL,
exportComments varchar(64) DEFAULT NULL,
invoiceFree varchar(64) DEFAULT NULL,
auditFree varchar(64) DEFAULT NULL,
creditRecords longtext,
externalFormLinks longtext,
payment longtext,
costTrackings longtext,
expenses longtext,
approval_process longtext,
finance_codes varchar(64) DEFAULT NULL,
repayments longtext,
allowances longtext,
travelRecords longtext,
operationLogs longtext,
baseCurrency varchar(64) DEFAULT NULL,
collectionToBaseExchangeRate varchar(64) DEFAULT NULL,
baseAmount varchar(64) DEFAULT NULL,
payments longtext,
attachments longtext,
savetime varchar(32) DEFAULT NULL,
PRIMARY KEY (report_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE t_center_maycur_expensesubmit (
report_id varchar(64) NOT NULL DEFAULT '',
report_type varchar(64) DEFAULT NULL,
formSubType varchar(64) DEFAULT NULL,
NAME varchar(64) DEFAULT NULL,
DATE varchar(64) DEFAULT NULL,
amount varchar(64) DEFAULT NULL,
approvedAmount varchar(64) DEFAULT NULL,
collectionCurrency varchar(64) DEFAULT NULL,
cost_center varchar(64) DEFAULT NULL,
departmentBusinessCode varchar(64) DEFAULT NULL,
departmentName varchar(64) DEFAULT NULL,
departmentFullName varchar(128) DEFAULT NULL,
reim_user_code varchar(64) DEFAULT NULL,
reimUserName varchar(64) DEFAULT NULL,
cover_user_code varchar(64) DEFAULT NULL,
coverUserName varchar(64) DEFAULT NULL,
STATUS varchar(64) DEFAULT NULL,
pay_amount varchar(64) DEFAULT NULL,
pay_method varchar(64) DEFAULT NULL,
subsidiary_name varchar(64) DEFAULT NULL,
subsidiary_code varchar(64) DEFAULT NULL,
createdAt varchar(64) DEFAULT NULL,
submittedAt varchar(64) DEFAULT NULL,
approvedAt varchar(64) DEFAULT NULL,
settledAt varchar(64) DEFAULT NULL,
modifiedAt varchar(64) DEFAULT NULL,
deleteFlag varchar(64) DEFAULT NULL,
exportflag int(11) DEFAULT '0',
exporttime varchar(32) DEFAULT NULL,
savetime varchar(32) DEFAULT NULL,
createflag int(11) DEFAULT '0' COMMENT '是否已创建oa单据:0-未创建;1-已创建',
createtime varchar(32) DEFAULT NULL COMMENT '创建OA单据时间',
paymentstatus int(11) DEFAULT '0' COMMENT '是否已通知每刻:0-未通知;1-已通知',
paymenttime varchar(32) DEFAULT NULL COMMENT '通知每刻时间',
oaorderid varchar(64) DEFAULT NULL COMMENT 'oa单据id',
PRIMARY KEY (report_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;