/*
 Navicat MySQL Data Transfer

 Source Server         : sureface
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : officialwebsite

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 20/05/2018 21:57:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum_order_wechat
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_order_wechat`;
CREATE TABLE `curriculum_order_wechat`  (
  `order_wechat_id` bigint(18) NOT NULL COMMENT '微信订单ID',
  `curriculum_order_id` bigint(18) NOT NULL COMMENT '订单ID',
  `order_wechat_user_id` bigint(18) NOT NULL COMMENT '用户ID',
  `order_wechat_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '微信订单状态（AES加密）',
  `order_wechat_create_time` datetime(0) NOT NULL COMMENT '微信订单创建时间',
  PRIMARY KEY (`order_wechat_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '微信订单' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
