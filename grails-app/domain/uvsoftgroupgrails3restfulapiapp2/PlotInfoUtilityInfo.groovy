package uvsoftgroupgrails3restfulapiapp2

import grails.rest.Resource

@Resource(uri = '/plotInfoUtilityInfos')
class PlotInfoUtilityInfo {

	Long utId,utCreaterAddressId,utPlId
	String utType,utCreaterName,utCreaterAuthority,utRemark
	Date utCreateDate,utLastModifiedDate,utSubmissionDate,utApprovalDate,utServiceDate,utDisServiceDate
	byte [] utTypePic

	static belongsTo =[plotInfo:PlotInfo]
	static constraints = {
		utId()
		utCreaterAddressId()
		utCreaterName()
		utCreaterAuthority()
		utCreateDate()
		utLastModifiedDate()
		utSubmissionDate()
		utApprovalDate()
		utServiceDate()
		utDisServiceDate()
		utTypePic()
		utRemark()
		utPlId()
	}
	String toString() { "${utId}-${utType}" }
	static mapping = {
		table 'plot_utility'
		version false
		columns {
			utId column:'ut_id'
			utCreaterAddressId column:'ut_ca_id'
			utType column:'ut_type'
			utCreaterName column:'ut_cn_id'
			utCreaterAuthority column:'ut_cau_id'
			utCreateDate column:'ut_cd_id'
			utLastModifiedDate column:'ut_lmd_id'
			utSubmissionDate column:'ut_sd_id'
			utApprovalDate column:'ut_ad_id'
			utServiceDate column:'ut_sed_id'
			utDisServiceDate column:'ut_dsd_id'
			utTypePic column:'ut_tp_id'
			utRemark column:'ut_remark'
			utPlId column:'ut_pl_id'
		}
	}
}
