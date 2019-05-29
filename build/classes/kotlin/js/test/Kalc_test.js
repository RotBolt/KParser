if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'Kalc_test'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'Kalc_test'.");
}
var Kalc_test = function (_, Kotlin) {
  'use strict';
  Kotlin.defineModule('Kalc_test', _);
  return _;
}(typeof Kalc_test === 'undefined' ? {} : Kalc_test, kotlin);
