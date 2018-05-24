package uvsoftgroupgrails3restfulapiapp2
import grails.rest.Resource

@Resource(uri = '/plotInfos')
	class PlotInfo {
		long plId,plAddressId
		String plCode,plName,plType,plNumber,plMonzaNumber,plCSNumber,plMSNumber,plRemark
		Double plTotalArea,plTotalBuildingCoverArea,plNumberOfBuilding,plHeightFromMSL,plCenterLongitude,plCenterLatitude
		byte [] plLayoutPicture,utilityLocationMap

		String toString() { "${plId}-${plAddressId}-${plType}" }
		static hasMany =[ownership:PlotInfoOwnershipInfo,authorizationInfo:PlotInfoAuthorizationInfo, utilityInfo:PlotInfoUtilityInfo,
						 billingInfo:PlotInfoBillingInfo, paymentInfo:PlotInfoPaymentInfo, buildingInfo:BuildingInfo]
		static constraints = {
			plId()
			plAddressId()
			plCode()
			plName()
			plType()
			plNumber()
			plMonzaNumber()
			plCSNumber()
			plMSNumber()
			plTotalArea()
			plTotalBuildingCoverArea()
			plNumberOfBuilding()
			plHeightFromMSL()
			plCenterLongitude()
			plCenterLatitude()
			plLayoutPicture()
			utilityLocationMap()
			plRemark()
			ownership()
			authorizationInfo()
			utilityInfo()
			billingInfo()
			paymentInfo()
			buildingInfo()
		}
		static mapping = {
			table 'plotInfo'
			version false
			columns {
				plId column:'pl_id'
				plAddressId column:'pl_ad_id'
				plCode column:'pl_code'
				plName column:'pl_name'
				plType column:'pl_type'
				plNumber column:'pl_number'
				plMonzaNumber column:'pl_monza_num'
				plCSNumber column:'pl_cs_num'
				plMSNumber column:'pl_ms_num'
				plTotalArea column:'pl_tot_area'
				plTotalBuildingCoverArea column:'pl_tot_bc_area'
				plNumberOfBuilding column:'pl_build_num'
				plHeightFromMSL column:'pl_height_msl'
				plCenterLongitude column:'pl_ce_longitude'
				plCenterLatitude column:'pl_ce_latitude'
				plLayoutPicture column:'pl_layout_pic'
				utilityLocationMap column:'pl_uti_lo_map'
				plRemark column:'pl_remark'
			}
		}

	}