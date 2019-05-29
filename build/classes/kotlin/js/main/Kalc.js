if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'Kalc'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'Kalc'.");
}
var Kalc = function (_, Kotlin) {
  'use strict';
  var Enum = Kotlin.kotlin.Enum;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var throwISE = Kotlin.throwISE;
  var Exception_init = Kotlin.kotlin.Exception_init_pdl1vj$;
  var Exception = Kotlin.kotlin.Exception;
  var ArrayList_init = Kotlin.kotlin.collections.ArrayList_init_287e2$;
  ExpressionParser$Operators.prototype = Object.create(Enum.prototype);
  ExpressionParser$Operators.prototype.constructor = ExpressionParser$Operators;
  OperatorEndException.prototype = Object.create(Exception.prototype);
  OperatorEndException.prototype.constructor = OperatorEndException;
  function ExpressionParser() {
  }
  function ExpressionParser$Operators(name, ordinal, sign) {
    Enum.call(this);
    this.name$ = name;
    this.ordinal$ = ordinal;
  }
  function ExpressionParser$Operators_initFields() {
    ExpressionParser$Operators_initFields = function () {
    };
    ExpressionParser$Operators$PLUS_instance = new ExpressionParser$Operators('PLUS', 0, 43);
    ExpressionParser$Operators$MINUS_instance = new ExpressionParser$Operators('MINUS', 1, 45);
    ExpressionParser$Operators$MULTIPLY_instance = new ExpressionParser$Operators('MULTIPLY', 2, 42);
    ExpressionParser$Operators$DIVISION_instance = new ExpressionParser$Operators('DIVISION', 3, 47);
    ExpressionParser$Operators$POWER_instance = new ExpressionParser$Operators('POWER', 4, 94);
    ExpressionParser$Operators$EXPONENTIAL_instance = new ExpressionParser$Operators('EXPONENTIAL', 5, 69);
  }
  var ExpressionParser$Operators$PLUS_instance;
  function ExpressionParser$Operators$PLUS_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$PLUS_instance;
  }
  var ExpressionParser$Operators$MINUS_instance;
  function ExpressionParser$Operators$MINUS_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$MINUS_instance;
  }
  var ExpressionParser$Operators$MULTIPLY_instance;
  function ExpressionParser$Operators$MULTIPLY_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$MULTIPLY_instance;
  }
  var ExpressionParser$Operators$DIVISION_instance;
  function ExpressionParser$Operators$DIVISION_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$DIVISION_instance;
  }
  var ExpressionParser$Operators$POWER_instance;
  function ExpressionParser$Operators$POWER_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$POWER_instance;
  }
  var ExpressionParser$Operators$EXPONENTIAL_instance;
  function ExpressionParser$Operators$EXPONENTIAL_getInstance() {
    ExpressionParser$Operators_initFields();
    return ExpressionParser$Operators$EXPONENTIAL_instance;
  }
  ExpressionParser$Operators.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Operators',
    interfaces: [Enum]
  };
  function ExpressionParser$Operators$values() {
    return [ExpressionParser$Operators$PLUS_getInstance(), ExpressionParser$Operators$MINUS_getInstance(), ExpressionParser$Operators$MULTIPLY_getInstance(), ExpressionParser$Operators$DIVISION_getInstance(), ExpressionParser$Operators$POWER_getInstance(), ExpressionParser$Operators$EXPONENTIAL_getInstance()];
  }
  ExpressionParser$Operators.values = ExpressionParser$Operators$values;
  function ExpressionParser$Operators$valueOf(name) {
    switch (name) {
      case 'PLUS':
        return ExpressionParser$Operators$PLUS_getInstance();
      case 'MINUS':
        return ExpressionParser$Operators$MINUS_getInstance();
      case 'MULTIPLY':
        return ExpressionParser$Operators$MULTIPLY_getInstance();
      case 'DIVISION':
        return ExpressionParser$Operators$DIVISION_getInstance();
      case 'POWER':
        return ExpressionParser$Operators$POWER_getInstance();
      case 'EXPONENTIAL':
        return ExpressionParser$Operators$EXPONENTIAL_getInstance();
      default:throwISE('No enum constant io.thelimitbreaker.ExpressionParser.Operators.' + name);
    }
  }
  ExpressionParser$Operators.valueOf_61zpoe$ = ExpressionParser$Operators$valueOf;
  ExpressionParser.prototype.evaluate_61zpoe$ = function (expression) {
    var tmp$, tmp$_0;
    tmp$ = ExpressionParser$Operators$values();
    for (tmp$_0 = 0; tmp$_0 !== tmp$.length; ++tmp$_0) {
      var operator = tmp$[tmp$_0];
    }
    return 0.0;
  };
  ExpressionParser.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ExpressionParser',
    interfaces: []
  };
  function OperatorEndException(message) {
    if (message === void 0)
      message = 'Operator At end of expression';
    Exception_init(message, this);
    this.name = 'OperatorEndException';
  }
  OperatorEndException.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'OperatorEndException',
    interfaces: [Exception]
  };
  function StackNative() {
    this.stack_0 = ArrayList_init();
    this.top_0 = -1;
  }
  StackNative.prototype.push_11rb$ = function (item) {
    this.stack_0.add_11rb$(item);
    this.top_0 = this.top_0 + 1 | 0;
  };
  StackNative.prototype.pop = function () {
    var tmp$;
    var item = this.stack_0.get_za3lpa$((tmp$ = this.top_0, this.top_0 = tmp$ - 1 | 0, tmp$));
    if (this.isMoreHalfEmpty_0()) {
      this.freeEmptySpace_0();
    }
    return item;
  };
  StackNative.prototype.peek = function () {
    return this.stack_0.get_za3lpa$(this.top_0);
  };
  StackNative.prototype.size = function () {
    return this.top_0 + 1 | 0;
  };
  StackNative.prototype.isEmpty = function () {
    return this.top_0 === -1;
  };
  StackNative.prototype.isMoreHalfEmpty_0 = function () {
    return this.top_0 < ((this.stack_0.size - 1 | 0) / 2 | 0);
  };
  StackNative.prototype.freeEmptySpace_0 = function () {
    var tmp$, tmp$_0;
    tmp$ = this.top_0 + 1 | 0;
    tmp$_0 = this.stack_0.size;
    for (var i = tmp$; i < tmp$_0; i++) {
      this.stack_0.removeAt_za3lpa$(i);
    }
  };
  StackNative.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'StackNative',
    interfaces: []
  };
  var package$io = _.io || (_.io = {});
  var package$thelimitbreaker = package$io.thelimitbreaker || (package$io.thelimitbreaker = {});
  package$thelimitbreaker.ExpressionParser = ExpressionParser;
  package$thelimitbreaker.OperatorEndException = OperatorEndException;
  package$thelimitbreaker.StackNative = StackNative;
  Kotlin.defineModule('Kalc', _);
  return _;
}(typeof Kalc === 'undefined' ? {} : Kalc, kotlin);
