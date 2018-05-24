package uvsoftgroupgrails3restfulapiapp2
import java.util.Date;
import grails.rest.Resource

@Resource(uri = '/plotInfoAuthorizationInfos')
class PlotInfoAuthorizationInfo {
	Long auId,auAddressId,auPlId
	Date auAppliedDate,auApprovalDate,auPublishDate
	String auCode,auName,auType,auNumber,auServiceCode,auServiceName,auRemark
	byte [] auApplicationCopy,auApprovedCopy

	static belongsTo =[plotInfo:PlotInfo]
	static constraints = {
		auId()
		auAddressId()
		auAppliedDate()
		auApprovalDate()
		auPublishDate()
		auCode()
		auName()
		auType()
		auNumber()
		auServiceCode()
		auServiceName()
		auApplicationCopy()
		auApprovedCopy()
		auRemark()
		auPlId()
	}
	String toString() { "${auId} - ${auPlId}" }
	static mapping = {
		table 'plot_authorization'
		version false
		columns {
			auId column:'au_id'
			auAddressId column:'au_ad_id'
			auAppliedDate column:'au_appl_date'
			auApprovalDate column:'au_appr_date'
			auPublishDate column:'au_publ_date'
			auCode column:'au_code'
			auName column:'au_name'
			auType column:'au_type'
			auNumber column:'au_number'
			auServiceCode column:'au_serv_code'
			auServiceName column:'au_serv_name'
			auApplicationCopy column:'au_appl_copy'
			auApprovedCopy column:'au_appr_copy'
			auRemark column:'au_remark'
			auPlId column:'au_pl_id'
		}
	}
}
