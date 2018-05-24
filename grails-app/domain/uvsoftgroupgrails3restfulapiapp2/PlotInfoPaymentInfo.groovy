package uvsoftgroupgrails3restfulapiapp2

import java.util.Date;
import grails.rest.Resource

@Resource(uri = '/plotInfoPaymentInfos')
class PlotInfoPaymentInfo {
	Long paId,paPlId,paBiId,paCreaterAddressId
	String paType,paRefNumber,paRemark,paCreaterName,pyCreaterAuthority
	Date  paDate
	byte [] paCopy
	Double paTotalAmount,paPaidAmount

	static belongsTo =[plotInfo:PlotInfo]
	static constraints = {
		paPlId()
		paId()
		paBiId()
		paCreaterAddressId()
		paCreaterName()
		pyCreaterAuthority()
		paType()
		paDate()
		paRefNumber()
		paTotalAmount()
		paPaidAmount()
		paCopy()
		paRemark()
	}
	String toString() {
		"${paId}-${paBiId}"
	}
	static mapping = {
		table 'plot_payment'
		version false
		columns {
			paPlId  column:'pa_pl_id'
			paId column:'pa_id'
			paBiId column:'pa_bi_id'
			paCreaterAddressId  column:'pa_ad_id'
			paCreaterName column:'pa_cr_name'
			pyCreaterAuthority column:'pa_cr_auth'
			paType column:'pa_type'
			paDate column:'pa_date'
			paRefNumber column:'pa_ref_num'
			paTotalAmount column:'pa_to_amount'
			paPaidAmount column:'pa_pa_amount'
			paCopy column:'pa_copy'
			paRemark column:'pa_remark'
		}
	}
}
