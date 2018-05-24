package uvsoftgroupgrails3restfulapiapp2

import java.util.Date;
import grails.rest.Resource

@Resource(uri = '/plotInfoBillingInfos')
class PlotInfoBillingInfo {
	Long biId,biCreaterAddressId, biPlId
	String biCreaterName,biCreaterAuthority
	Date biCreateDate,biPayDateUntil,biLastModifiedDate,biPrintDate
	String biCurrency,biCostType,biReferenceNumber,biRemark
	byte [] biPrintCopy
	Double biAmount
	static belongsTo =[plotInfo:PlotInfo]
	static constraints = {
		biId()
		biCreaterAddressId()
		biCreaterName()
		biCreaterAuthority()
		biCreateDate()
		biPayDateUntil()
		biLastModifiedDate()
		biPrintDate()
		biCurrency()
		biCostType()
		biPrintCopy()
		biAmount()
		biReferenceNumber()
		biRemark()
		biPlId()
	}
	String toString() { "${biId}-${biCostType}" }
	static mapping = {
		table 'plot_billing'
		version false
		columns {
			biId column:'bi_id'
			biCreaterAddressId column:'bi_cra_id'
			biCreaterName column:'bi_cr_name'
			biCreaterAuthority column:'bi_cr_auth'
			biCreateDate column:'bi_cr_date'
			biPayDateUntil column:'bi_pd_until'
			biLastModifiedDate column:'bi_lm_date'
			biPrintDate column:'bi_pr_date'
			biCurrency column:'bi_currency'
			biCostType column:'bi_cost_type'
			biPrintCopy column:'bi_print_copy'
			biAmount column:'bi_amount'
			biReferenceNumber column:'bi_ref_num'
			biRemark column:'bi_remark'
			biPlId column:'bi_pl_id'
		}
	}
}
