package com.yycoin.vo.packageinfo;

import java.util.List;
import java.util.Map;

public interface TCenterPackageMapperExt {

	List<TCenterPackage> queryPackageInfo4Condition(Map<String, String> paramMap);

	List<Map<String, Object>> queryPackageFlowOutData();

}