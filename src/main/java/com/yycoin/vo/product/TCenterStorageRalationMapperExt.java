package com.yycoin.vo.product;

import java.util.List;
import java.util.Map;

public interface TCenterStorageRalationMapperExt {

	List<TCenterStorageRalation> selectData2Make();

	List<TCenterStorageRalation> selectAmountGrateThanZeroData();

	List<TCenterStorageRalation> selectAllChangeData(Map<String, String> paramMap);
}