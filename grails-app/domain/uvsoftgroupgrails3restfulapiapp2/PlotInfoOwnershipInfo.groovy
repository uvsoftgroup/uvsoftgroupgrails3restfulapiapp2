package uvsoftgroupgrails3restfulapiapp2

import java.util.Date;
import grails.rest.Resource

@Resource(uri = '/plotInfoOwnershipInfos')
class PlotInfoOwnershipInfo {

	Long owId,owPlId,owAddressId
	String owFullName,owType,owStatus,owRemark
	Date owAppliedDate,owLastModifiedDate,owApprovedDate
	static belongsTo =[plotInfo:PlotInfo]
	static constraints = {
		owId()
		owAddressId()
		owFullName()
		owType()
		owAppliedDate()
		owLastModifiedDate()
		owApprovedDate()
		owStatus()
		owRemark()
		owPlId()
	}
	String toString() {
		"${owId} - ${owAddressId}"
	}
	static mapping = {
		table 'plot_ownership'
		version false
		columns {
			owAddressId column:'ow_ad_id'
			owId column:'ow_id'
			owFullName column:'ow_fu_name',nullable:true, blank:true
			owType column:'ow_type', nullable:true, blank:true
			owAppliedDate column:'ow_ap_date', nullable:true, blank:true
			owLastModifiedDate column:'ow_lm_date', nullable:true, blank:true
			owApprovedDate column:'ow_app_date', nullable:true, blank:true
			owStatus column:'ow_status' ,nullable:true, blank:true
			owRemark column:'ow_remark' ,nullable:true, blank:true
			owPlId column:'ow_pl_id'
		}
	}
}
